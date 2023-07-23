import unittest

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


class addTest(unittest.TestCase):
    
    def tone(self):
        self.assertEqual(MathDojo().add(1,2,3,4,5,6,7).result,28)

    def ttwo(self):
        self.assertEqual(MathDojo().add(1,2,3,4).result,10)

    def tup(self):
        print( "Running add Test ")

    def tdwon(self):
        print( "Test over ")

class substractTest(unittest.TestCase):
    
    def tone(self):
        self.assertEqual(MathDojo().subtract(11).result,-11)

    def ttwo(self):
        self.assertEqual(MathDojo().subtract(1,2,3,4).result,-9)

    def tup(self):
        print(" Running Substract Test " )

    def tdwon(self):
        print("Test over")



if __name__ == '__main__':
    unittest.main()