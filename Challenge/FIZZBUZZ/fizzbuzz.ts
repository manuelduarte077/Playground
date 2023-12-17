const FizzBuzz = (num: number): string => {
  let result: number;

  for (let i = 1; i <= num; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
      result = i;
      console.log("FizzBuzz");
    }
    if (i % 3 === 0) {
      result = i;
      console.log("Fizz");
    }

    if (i % 5 === 0) {
      result = i;
      console.log("Buzz");
    }

    if (i % 3 !== 0 && i % 5 !== 0) {
      result = i;
      console.log(result);
    }
  }

  return "Done";
};

FizzBuzz(100);
