mdc a b
	|a == 0 = b
	|b >= a  = mdc (b - a a)
	|true   = mdc (b     a)
