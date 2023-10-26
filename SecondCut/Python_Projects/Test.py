from Rectangle import Rectangle
from Circle import Circle       
from Triangle import RightTriangle       


pizza = Circle(12)
print("Area pizza mediana: " , pizza.area())
print("Perimetro pizza mediana: " , pizza.perimeter())

lote = Circle(20)
print("Area pizza mediana: " , lote.area())
print("Perimetro del lote: " , lote.perimeter())

desk = Rectangle(12, 2)
print("Area del escritorio: ", desk.area())
print("Perimetro del escritorio: ", desk.perimeter())

chocoramoSquare = RightTriangle(3, 5)
print("El area de una esquina de chocoramo es: ", chocoramoSquare.Area())
print("El perimetro de una esquina de chocoramo es: ", chocoramoSquare.Perimeter())