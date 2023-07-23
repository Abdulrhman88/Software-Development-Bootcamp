class MathDojo:
    def __init__(self):
        self.result = 0

    def add(self, num, *nums):
        self.result += num
        if(nums):
            for x in nums:
                self.result += x
        return self

    def subtract(self, num, *nu):
        self.result -= num
        if(nu):
            for x in nu:
                self.result -= x
        return self


md = MathDojo()
x = md.add(10).add(5).subtract(2,1,3).result
print(x)	#should print 9