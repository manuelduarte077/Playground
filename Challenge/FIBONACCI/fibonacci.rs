fn fibonacci(n: usize) -> Vec<u64> {
    let mut fib_sequence: Vec<u64> = vec![0, 1];

    while fib_sequence.len() < n {
        let next_number =
            fib_sequence[fib_sequence.len() - 1] + fib_sequence[fib_sequence.len() - 2];
        fib_sequence.push(next_number);
    }

    fib_sequence.truncate(n);
    fib_sequence
}

fn main() {
    // Imprimir los primeros 50 números de Fibonacci
    let primeros_50_fibonacci = fibonacci(50);
    println!("{:?}", primeros_50_fibonacci);
}
