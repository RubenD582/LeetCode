def romanToInt(s):
    """
    :type s: str
    :rtype: int
    """

    roman_values = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    }
    
    # Initialize result
    result = 0
    
    # Iterate through the string from left to right
    for i in range(len(s)):
        # If the current numeral is smaller than the next one, subtract its value
        if i < len(s) - 1 and roman_values[s[i]] < roman_values[s[i + 1]]:
            result -= roman_values[s[i]]
        # Otherwise, add its value
        else:
            result += roman_values[s[i]]
    
    return result

print(romanToInt("MCDLXXVI"))