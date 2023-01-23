class Solution:
    def firstUniqChar(self, s: str) -> int:
        l= list(s)
        freq = {}
        for i in l:
            if i in freq:
                freq[i] += 1
            else:
                freq[i] = 1
        for i in freq:
            if freq[i]==1:
                return l.index(i)
        return -1