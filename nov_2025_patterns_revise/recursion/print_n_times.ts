function print_n_times(n, output) {
  if (n == 0) return output;
  return print_n_times(n - 1, "sourabh " + output);
}

const op = print_n_times(5, "");
console.log(op);
