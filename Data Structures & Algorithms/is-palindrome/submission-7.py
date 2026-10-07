class Solution:
    def isPalindrome(self, s: str) -> bool:
        an_s = "".join(c for c in s if c.isalnum()).lower()

        half = len(an_s)//2

        for i in range(half):
            if an_s[i] != an_s[~i]:
                return False
        
        return True





        