.data
save: .dword 5, 5, 5, 10, 7

.text
.globl main

main:
	#initializing all the values
	li x22, 0
	li x24, 5
	la, x25, save
	
loop:	slli x10, x22, 3 # computing offset
	add x10, x10, x25 #element address
	ld x9, 0(x10) # got the value of save[i]
	bne x9, x24, exit # compare and exit if (save[i] != k)
	addi, x22, x22, 1 #increment i value
	j loop
	
exit:
	ld a7, 10
	ecall