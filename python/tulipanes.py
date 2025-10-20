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

tu.tracer(2)
tu.hideturtle()
pen.speed(10)
screen.getcanvas().winfo_toplevel().attributes("-fullscreen", True)

pen.up()
pen.goto(200, 450)  # Move the turtle to the center of the screen
pen.down()
pen.write("Con mucho cariño de parte de Manuel ❤️", align="center", font=("Arial", 30, "normal")   )

pen.up()
pen.goto(-450, 400)
pen.down()
pen.write("❤️", align="center", font=("Arial", 100, "normal"))


for i in range(len(coordinates)):
    path = coordinates[i]
    col = colour[i]
    pen.color(col)
    pen.begin_fill()

    # Mover al primer punto sin dibujar
    if path:
        first_x, first_y = path[0]
        pen.up()
        pen.goto(first_x, -first_y)  # Invertir Y
        pen.down()
        
        # Dibujar línea al resto de puntos
        for x, y in path[1:]:
            pen.goto(x, -y)  # Invertir Y

    pen.end_fill()
    pen.hideturtle()

print(f"Dibujando {len(coordinates)} tulipanes...")
screen.mainloop()
