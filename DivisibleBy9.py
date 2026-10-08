class Solution:

    def isDivisibleBy9(self, s: str) -> bool:
        digit_sum = 0

        for digit in s:
            digit_sum += int(digit)

        return digit_sum % 9 == 0


# Main program
s = input("Enter a number: ")

obj = Solution()

if obj.isDivisibleBy9(s):
    print("Yes")
else:
    print("No")