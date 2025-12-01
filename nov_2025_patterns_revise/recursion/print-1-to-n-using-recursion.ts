function print_1_to_n(n) {
  if (n == 0) return 0;
  console.log(n);
  print_1_to_n(n - 1);
}

print_1_to_n(5);
