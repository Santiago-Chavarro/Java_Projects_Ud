class Circle:
    pi = 3.14

    def __init__(self, diameter):
        self.radius = diameter / 2

    def area(self):
        return self.pi * self.radius ** 2
    
    def perimeter(self):
        return self.pi * 2 * self.radius
    
medium_pizza = Circle(12)
print("Area pizza mediana: " , medium_pizza.area())
print("Perimetro pizza mediana: " , medium_pizza.perimeter())

lote = Circle(20)
print("Area pizza mediana: " , lote.area())
print("Perimetro del lote: " , lote.perimeter())