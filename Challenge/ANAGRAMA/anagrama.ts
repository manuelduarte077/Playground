const sonAnagramas = (palabra1: string, palabra2: string): boolean => {
  const palabra1Ordenada = palabra1.split("").sort().join("");
  const palabra2Ordenada = palabra2.split("").sort().join("");

  return palabra1Ordenada === palabra2Ordenada;
};

console.log(sonAnagramas("amor", "roma"));
