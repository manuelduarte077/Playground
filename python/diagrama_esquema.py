from graphviz import Digraph
from PIL import Image

# Estilo de los nodos
node_style = {'shape': 'box', 'style': 'filled', 'fillcolor': 'lightgrey'}

# Crear el diagrama de esquema separado en español
dot_esquema_separado = Digraph(comment='Diagrama de Esquema en Español', format='png')

# Definir los nodos en español para el esquema de la app
dot_esquema_separado.node('A', 'Pantalla de Introducción', **node_style)
dot_esquema_separado.node('B', 'Registro/Iniciar Sesión', **node_style)
dot_esquema_separado.node('C', 'Configuración de Perfil', **node_style)
dot_esquema_separado.node('D', 'Pantalla Principal', **node_style)
dot_esquema_separado.node('E', 'Citas Médicas', **node_style)
dot_esquema_separado.node('F', 'Lista de Médicos', **node_style)
dot_esquema_separado.node('G', 'Confirmación de Cita', **node_style)
dot_esquema_separado.node('H', 'Ajustes', **node_style)
dot_esquema_separado.node('I', 'Notificaciones', **node_style)

# Conectar los nodos con descripciones en español para el esquema
dot_esquema_separado.edge('A', 'B', label='Iniciar aplicación')
dot_esquema_separado.edge('B', 'C', label='Cuenta creada')
dot_esquema_separado.edge('C', 'D', label='Perfil completado')
dot_esquema_separado.edge('D', 'E', label='Ir a citas')
dot_esquema_separado.edge('E', 'F', label='Seleccionar médico')
dot_esquema_separado.edge('F', 'G', label='Confirmar cita')
dot_esquema_separado.edge('D', 'H', label='Acceder a ajustes')
dot_esquema_separado.edge('D', 'I', label='Ver notificaciones')

# Guardar el diagrama de esquema separado
dot_esquema_separado.render('Diagrama_Esquema_Separado', view=True)


# Mostrar la imagen generada del diagrama de esquema
# img_esquema_separado = Image.open('/mnt/data/Diagrama_Esquema_Separado.png')
# img_esquema_separado.show()
dot_esquema_separado.render('/Users/donmanuel/Desktop/Diagrama_Esquema_Separado', view=True)