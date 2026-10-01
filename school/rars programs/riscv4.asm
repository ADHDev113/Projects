.data
x: .dword 10
y: .dword 5
result: .dword 0

.text
.globl main

#result = x + y
main: 
	la t0, x
	ld t1, 0(t0)
	#get the address of y
	la t0, y
	#get the value of y
	ld t2, 0(t0)
	
	add t3, t1, t2
	
	#get the address of result
	la t0, result
	
	sd t3, 0(t0)
	
	li a7, 10
	ecall