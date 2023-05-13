package main

import (
	"fmt"
	"log"
	"net/http"
)

func main() {
	http.HandleFunc("/", Home)

	log.Print("Server started on localhost:8080\nPress Ctrl + C to exit")

	log.Fatal(http.ListenAndServe(":8080", nil))
}

func Home(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World")
}
