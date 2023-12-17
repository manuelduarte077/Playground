void main(List<String> args) {
  print(anagrama('amor', 'roma'));
  print(anagrama('amor', 'romaa'));
}

bool anagrama(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();

  if (a.length != b.length) return false;

  for (var i = 0; i < a.length; i++) {
    if (b.indexOf(a[i]) == -1) return false;
  }

  return true;
}
