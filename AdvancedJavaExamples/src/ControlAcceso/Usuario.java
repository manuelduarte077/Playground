package ControlAcceso;

// Clase Usuario
class Usuario {
    private String userName;
    private String password;

    public Usuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // Metodo para verificar la contraseña
    public boolean passwordVerify(String intentPassword) {
        return password.equals(intentPassword);
    }

    // Metodo para cambiar la contraseña
    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Contraseña cambiada con éxito.");
    }

    // Metodo para mostrar información del usuario
    public void showInformation() {
        System.out.println("Usuario: " + userName);
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "1234");

        usuario.showInformation();
        System.out.println("Verificación de contraseña: " + (usuario.passwordVerify("1234") ? "Correcta" : "Incorrecta"));

        usuario.changePassword("nueva1234");
        System.out.println("Verificación de nueva contraseña: " + (usuario.passwordVerify("nueva1234") ? "Correcta" : "Incorrecta"));
    }
}
