# python test

grades = {
	'A+' : 4.5,
	'A'  : 4,
	'B+' : 3.5,
	'B'  : 3,
	'C+' : 2.5
}

def factors(n):
	return [k for k in range(1,n+1) if n%k == 0]

def without_punctuation(s):
	# , ' . ; :
	chain = []
	for char in s:
		if char != ',' and char != '\'' and char != ';' and char != '.' and char != ':':
			chain.append(char)	
	return ''.join(chain)

if __name__ == '__main__':

	for val in grades:
		print(val)
