import turtle as tu
import re
import docx
import os

# Verificar que el archivo existe
if not os.path.exists("Source/tulips.docx"):
    print("Error: No se encontró el archivo Source/tulips.docx")
    exit(1)

try:
    data = docx.Document("Source/tulips.docx")
except Exception as e:
    print(f"Error al abrir el documento: {e}")
    exit(1)
coordinates = []
colour = []

for i in data.paragraphs:
    try:
        patron = r'[-+]?\d*\.\d*(?:[eE][-+]?\d+)?'
        patron_coord = r'\(' + patron + r' ?\, ?' + patron
        patron_color = patron_coord + r' ?\, ?' + patron + r'\)'

        coord_stg_tup = re.findall(patron_coord + r'\)', i.text)
        color_stg_tup = re.findall(patron_color, i.text)

        # Verificar que tenemos datos válidos
        if not color_stg_tup or not coord_stg_tup:
            continue
            
        coord_num_tup = []
        color_val = re.findall(r'[-+]?\d*\.\d*', color_stg_tup[0])
        
        # Verificar que tenemos suficientes valores de color (RGB)
        if len(color_val) < 3:
            continue
            
        color_val_lst = [float(k) for k in color_val]
        colour.append(tuple(color_val_lst))

        for j in coord_stg_tup:
            coord_pos = re.findall(r'[-+]?\d*\.\d*', j)
            if len(coord_pos) >= 2:  # Verificar que tenemos x,y
                coord_num_lst = [float(k) for k in coord_pos]
                coord_num_tup.append(tuple(coord_num_lst))

        if coord_num_tup:  # Solo agregar si tenemos coordenadas válidas
            coordinates.append(coord_num_tup)
    except Exception as e:
        print(f"Error procesando párrafo: {e}")
        continue

pen = tu.Turtle()
screen = tu.Screen()

# Configuración mejorada para mejor calidad visual
screen.bgcolor("#f8f8ff")  # Fondo blanco azulado suave
screen.colormode(255)  # Usar valores RGB de 0-255
tu.tracer(0)  # Desactivar animación para mejor calidad
tu.hideturtle()
pen.speed(0)  # Velocidad máxima
pen.width(2)  # Grosor de línea más visible

# Configurar ventana a pantalla completa
screen.getcanvas().winfo_toplevel().attributes("-fullscreen", True)
screen.title("Tulipanes para Greyvel 💜")

# Dibujar un marco decorativo sutil
pen.up()
pen.goto(-600, -400)
pen.down()
pen.color("#e6e6fa")
pen.width(3)
for _ in range(4):
    pen.forward(1200)
    pen.left(90)
pen.up()

# Texto principal con fuente más elegante
pen.up()
pen.goto(0, 450)
pen.down()
pen.color("darkred")
pen.write("Con mucho cariño de parte de Manuel", align="center", font=("Georgia", 28, "bold"))

# Corazón grande con mejor posicionamiento
pen.up()
pen.goto(-500, 350)
pen.down()
pen.color("red")
pen.write("❤️", align="center", font=("Arial", 120, "normal"))

# Corazón adicional para balance visual
pen.up()
pen.goto(500, 350)
pen.down()
pen.write("❤️", align="center", font=("Arial", 120, "normal"))


# Dibujar tulipanes con mejor calidad
for i in range(len(coordinates)):
    path = coordinates[i]
    col = colour[i]
    
    # Normalizar colores RGB (0-255)
    if len(col) >= 3:
        r, g, b = col[0], col[1], col[2]
        # Asegurar que los valores estén en el rango correcto
        r = max(0, min(255, int(r)))
        g = max(0, min(255, int(g)))
        b = max(0, min(255, int(b)))
        
        pen.color(r, g, b)
        pen.fillcolor(r, g, b)
    
    pen.begin_fill()
    pen.width(1)  # Líneas más finas para mejor detalle

    # Mover al primer punto sin dibujar
    if path:
        first_x, first_y = path[0]
        pen.up()
        pen.goto(first_x, -first_y)  # Invertir Y
        pen.down()
        
        # Dibujar línea al resto de puntos
        for x, y in path[1:]:
            pen.goto(x, -y)  # Invertir Y
        
        # Cerrar la forma volviendo al primer punto
        pen.goto(first_x, -first_y)

    pen.end_fill()
    pen.hideturtle()

# Actualizar la pantalla para mostrar todo el dibujo
tu.update()

print(f"Dibujando {len(coordinates)} tulipanes...")
print("Presiona cualquier tecla para cerrar la ventana")

# Mantener la ventana abierta
screen.mainloop()
