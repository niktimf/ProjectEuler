import scala.math.{floor, log, pow}

object ProjectEulerQuestion2:
	def main(args: Array[String]): Unit =
		val sq5 = pow(5, 0.5)
		val phi = (1 + sq5) / 2
		def sumEvenFibonacci(limit: Double): Double =
			val n = floor((floor(log(limit * sq5)) / log(phi)) / 3)
			((pow(phi, 3 * n + 3) - 1) / (pow(phi, 3) - 1) - (pow(1 - phi, 3 * n + 3) - 1) / (pow(1 - phi, 3) - 1)) / sq5

		println(floor(sumEvenFibonacci(4E6)))