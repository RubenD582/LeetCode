def reverse(x):
    """
    :type x: int
    :rtype: int
    """
    
    negative = str(x)[0] == "-"
    if negative:
        return int((str(x)[1:])[::-1])*-1
    else:
        return int((str(x))[::-1])

# print(reverse(123))
# print(reverse(-123))
# print(reverse(120))

print(9646324351 >= 2147483647)