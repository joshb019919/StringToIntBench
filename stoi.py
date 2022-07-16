def STOI(string):
  negative = False
  sLength = len(string)
  integer = 0
  i = 0

  if sLength == 0:
    return integer

  if string[0] == "-":
    negative = True
    i = 1

  while i < sLength:
    # if 48 <= ord(string[i]) and ord(string[i]) <= 57:
    if 48 <= ord(string[i]) <= 57:
      integer += (ord(string[i]) - 48) * ((10 ** (sLength - 1 - i)))
    i += 1

  if negative:
    integer = -integer

  return integer


def main():
  string = "123"
  string2 = "-123"
  string3 = ""
  string4 = "a123"

  int1 = STOI(string)
  print(type(int1))
  print(int1)

  int2 = STOI(string2)
  print(type(int2))
  print(int2)

  int3 = STOI(string3)
  print(type(int3))
  print(int3)

  int4 = STOI(string4)
  print(type(int4))
  print(int4)

if __name__ == "__main__":
  main()
