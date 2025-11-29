function pattern20(rows: number) {
  let output = "";
  for (let i = 1; i <= rows * 2; i++) {
    for (let j = 1; j < rows * 2; j++) {
      output += Math.abs(rows - i) <= Math.abs(rows - j) ? "*" : " ";
    }
    output += "\n";
  }
  console.log(output);
}

pattern20(5);
