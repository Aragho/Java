from datetime import datetime

store_name = "SEMICOLON STORES"
branch_name = "MAIN BRANCH"
location = "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS, NIGERIA"
phone_number = "TEL: 03293828343"

products = []
quantities = []
prices = []
total_for_item = []

customer_name = input("Whats the customer's name?")
adding_items = True

while adding_items:
	product = input("What did the user buy?")
	products.append(product)

	quantity = int(input("How many pieces?"))
	quantities.append(quantity)

	price = float(input("How much per unit?"))
	prices.append(price)

	item_total = quantity * price
	total_for_item.append(item_total)

	item = input("Add more items? (YES or NO)").strip().upper()
	if item == "NO":
		adding_items = False
	elif item != "YES":
		print("Please enter YES or NO.")

cashier_name = input("Whats the cashier's name?")

discount = float(input("How much discount will you get?"))


for index in range(len(products)):
	print(f"{products[index]: <10} {quantities[index]:>4} {prices[index]:>8.2f} {total_for_item[index]:>10.2f}")

total = sum(total_for_item)
vat = 0.175 * total
discount_amount = (discount / 100) * total
final_total = total -  discount_amount + vat

now = datetime.now()
date_time = now.strftime("%d-%m-%Y %H:%M:%S")










print(store_name)
print(branch_name)
print(location)
print(phone_number)
print(f"Date and Time: {datetime}")
print(f"Cashier's name: {cashier_name}")
print(f"Customer's name: {customer_name}")
print("======================================================================================")

print("ITEM\tQTY\tPRICE\tTOTAL(NGN)")
print("---------------------------------------------------------------------------------------------")


print("-------------------------------------------------------------------------------------")
print(f"\tSubtotal: NGN {total:>15.2f}")
print(f"\tVAT: NGN {vat:>20.2f}")
print(f"\tDiscount: NGN {discount_amount:>15.2f}")
print("--------------------------------------------------------------------------------------------")
print(f"\tTotal: NGN {final_total:>15.2f}")
print("==========================================================================================")

	


	
amount = float(input("How much did the customer give to you?"))
	
change_amount = amount - final_total

print(store_name, branch_name, location, phone_number, datetime, cashier_name, customer_name, products, quantities, prices, total_for_item, total, vat, discount_amount, final_total)

print(f"\tAmount paid: NGN {amount:>15.2f}")
print(f"\tBalance: NGN {change_amount:>15.2f}")
print("==========================================================================================")	
print("THANK YOU FOR YOUR PATRONAGE!")
print("===============================================================================")


	

	
	
	


	