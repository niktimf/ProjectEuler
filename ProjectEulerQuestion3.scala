object ProjectEulerQuestion3:
	def main(args: Array[String]): Unit =
		def largestPrimeFactor(num: Long): Vector[Long] =
			(2 to math.sqrt(num).toInt).find(num % _ == 0).fold(Vector(num))(x => x.toLong +: largestPrimeFactor(num / x))
		print(largestPrimeFactor(600851475143).last)