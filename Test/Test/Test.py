


class Test:

    def __init__(self) -> None:
        pass

    def fact1(self,n):
        product = 1
        while(n > 0):
            product = product *n
            n = n - 1
        return product

    #I like this one better
    def fact(self,n):
        if n <= 1:
            return 1
        return n * self.fact(n-1)
