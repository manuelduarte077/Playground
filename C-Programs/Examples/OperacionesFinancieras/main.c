#include <stdio.h>

struct Hora
{
    int h;
    int m;
    int s;
};

struct Fecha
{
    int dia;
    int mes;
    int anio;
};

struct operacionFinanciera
{
    int numeroCuenta;
    float total;
    int tipoDeposito;
    float saldo;
    struct Hora hora;
    struct Fecha fecha;
};

void deposito(struct operacionFinanciera *op)
{
    float monto;
    printf("Ingrese el monto a depositar: ");
    scanf("%f", &monto);
    op->saldo += monto;
}

void retiro(struct operacionFinanciera *op)
{
    float monto;
    printf("Ingrese el monto a retirar: ");
    scanf("%f", &monto);

    if (monto > op->saldo)
    {
        printf("saldo insuficiente\nTu saldo es de %f", op->saldo);
        return;
    }

    op->saldo -= monto;
}

int estado(struct operacionFinanciera *op)
{
    printf("Estado de cuenta: %.2f\n", op->saldo);
    return 0;
}

int main()
{
    int option;
    struct operacionFinanciera op;
    op.saldo = 100;
    do
    {

        printf("Transaccion financiera\n");
        printf("Selecciona una opcion\n\n1) Deposito\n2) Retiro de fondos\n3) Estado de cuenta\n4) Salir\n\n");
        scanf("%d", &option);

        switch (option)
        {
        case 1:
            deposito(&op);
            break;
        case 2:
            retiro(&op);
            break;
        case 3:
            estado(&op);
            break;
        case 4:
            printf("Saliendo...\n");
            break;
        default:
            printf("Esa opcion no es valida\n");
            break;
        }

    } while (option != 4);

    return 0;
}