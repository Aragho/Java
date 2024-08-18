name = input("Whats your Name:")
print("Be yourself and answer honestly to find out your personality type")
print("Learn how your personality type influences many areas of your life");
print("Grow into the person you want to be with your optional premuim suite");

QUESTIONS = [
		"1.(A) Expend Energy, Enjoy groups\t(B) Conserve Energy, Enjoy one on ones",
		"2.(A) Interpret Literally\t(B) Look for meaning and possibilities",
		"3.(A) Logical, thinking, questioning\t(B) Emphathetic, Feeling, Accomodating", 
		"4.(A) Organized, Orderly\t(B) Flexible, adaptable",
		"5.(A) More outgoing, think out loud\t(B) More reserved, Think to yourself",
		"6.(A) Practical, Realistic, Experiential\t(B) Imaginative, Innovative, Theoretical",
		"7.(A) Candid, Straight Forward, Frank\t(B) Tactful, Kind, Encouraging",
		"8.(A) Plan, Schedule\t(B) Unplanned, Spontaneous",
		"9.(A) Seeks Many tasks, Public activities, Interaction with others\t(B) Seek private, Solitary activities with quiet to concentrate",
		"10.(A) Standard, Usual, Conventional\t(B) Different, Novel, Unique",
		"11.(A) Firm Tend to criticize, Hold the line\t(B) Gentle, Tend to appreciate, Conciliate",
		"12.(A) Regulated, Structured\t(B) Easy-going, live and let live",
		"13.(A) External, Communicative, Express yourself\t(B) Internal, Reticent, Keep to yourself",
		"14.(A) Focus on here-and-now\t(B) Look to the future, Global perspective, Big picture",
		"15.(A) Tough-minded, Just\t(B) Tender-hearted, merciful",
		"16.(A) Preparation, Plan ahead\t(B) Go with the flow, Adapt as you go",
		"17.(A) Active, Initiate\t(B) Reflective, Deliberate",
		"18.(A) Facts, things, What is\t(B) Ideas, Dreams, What could be, Philosophical",
		"19.(A) Matter of fact, Issue-oriented\t(B) Sensitive, People-oriented, Compassionate",
		"20.(A) Control, Govern\t(B) Latitude, Freedom",
		] 

Extroverted = 0
Introverted = 0
Sensing = 0
Intuitive = 0
Thinking = 0
Feeling = 0
Judging = 0
Perceptive = 0
		
		
		
for index, question in enumerate(QUESTIONS):
	print(question)
	answer = input().strip().upper()

	while answer not in ['A', 'B']:
		answer = input("Please enter 'A' or 'B'")

	if index in [0,4,8,12,16]:
		if answer == 'A':
			extroverted += 1
		else:
			introverted +=1
	elif index in [1,5,9,13,17]:
		if answer == 'A':
			sensing +=1
		else:
			intuitive +=1
	elif index in [2,6,10,14,18]:
		if answer == 'A':
			thinking +=1
		else:
			feeling += 1
	elif index in [3,7,11,15,19]:
		if answer == 'A':
			judging +=1
		else:
			perceptive +=1
			
				
		
	personality_type =""
	personality_type +=  "E" if Extroverted > Introverted else "I"
	personality_type += "S" if Sensing > Intuitive else "N"
	personality_type += "T" if Thinking > Feeling else "F"
	personality_type += "J" if Judging > Perceptive else "P"

	print (f"\n Your MBTI Personality Test Type is: {personality_type}\n")

	print("""
	E - Extroverted
    	I - Introverted
    	N - Intuitive
    	S - Sensing
    	T - Thinking
    	F - Feeling
    	J - Judging
    	P - Perceptive
    	""")

		
	
	