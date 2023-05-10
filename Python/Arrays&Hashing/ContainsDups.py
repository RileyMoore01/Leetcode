class Solution(object):
    def containsDuplicates(self, nums):
        """
            nums => List[int]
        """
        hashSet = set()
        for i in nums:
            if i in hashSet:
                return True
            else:
                hashSet.add(i)