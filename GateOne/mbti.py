first_questions_answer = []
second_questions_answer= []
third_questions_answer= []
fourth_questions_answer= []
personality_type = []

def first_set_of_questions():
    first_questions = [
        "Expend energy, enjoy groups", "Conserve energy, enjoy one-on-one",
        "More outgoing, think out loud", "More reserved, think to yourself",
        "Seek many tasks, public activities, interaction with others", "Seek private, solitary activities with quiet to concentrate",
        "External, communicative, express yourself", "Internal, reticent, keep to yourself",
        "Active, initiate", "Reflective, deliberate"
    ]
    count = 0

    for index in range(0, len(first_questions), 2):
        print(f"A. {first_questions[index]} \t\t B. {first_questions[index + 1]}")

        answer = input().upper()
        while answer not in ('A', 'B'):
            print("You must select between A or B")
            answer = input().upper()

        if answer == "A":
           first_questions_answer.append("A. " + first_questions[index])
        else:
            first_questions_answer.append("B. " + first_questions[index + 1])
        count += 1

def second_set_of_questions():
    second_questions = [
        "Interpret literally", "Look for meaning and possibilities",
        "Practical, realistic, experimental", "Imaginative, innovative, theoretical",
        "Standard, usual, conventional", "Different, novel, unique",
        "Focus on here-and now", "Look to the future, global perspective, big picture",
        "Facts, things, what is", "Ideas, dreams, what could be, philosophical"
    ]
    count = 0

    for index in range(0, len(second_questions), 2):
        print(f"A. {second_questions[index]} \t\t  B. {second_questions[index + 1]}")

        answer = input().upper()
        while answer not in ('A', 'B'):
            print("You must select between A or B")
            answer = input().upper()

        if answer == "A":
           second_questions_answer.append("A. " + second_questions[index])
        else:
            second_questions_answer.append("B. " + second_questions[index + 1])
        count += 1

def third_set_of_questions():
    third_questions = [
        "Logical, thinking, questioning", "Empathetic, feeling, accomodating",
        "Candid, straight forward, frank", "Tactful, kind, encouraging",
        "Firm, tend to criticize, hold the line", "Gentle, tend to appreciate, conciliate",
        "Tough-minded, just", "Tender-hearted, merciful",
        "Matter of fact, issue-oriented", "Sensitive, people-oriented, compassionate"
    ]
    count = 0

    for index in range(0, len(third_questions), 2):
        print(f"A. {third_questions[index]} \t\t  B. {third_questions[index + 1]}")

        answer = input().upper()
        while answer not in ('A', 'B'):
            print("You must select between A or B")
            answer = input().upper()

        if answer == "A":
           third_questions_answer.append("A. " + third_questions[index])
        else:
            third_questions_answer.append("B. " + third_questions[index + 1])
        count += 1

def fourth_set_of_questions():
    fourth_questions = [
        "Organized, orderly", "Flexible, adaptable",
        "Plan, schedule", "Unplanned, spontaneous",
        "Regulated, structured", "Easy-going, live and let live",
        "Preparation, plan ahead", "Go with the flow, adapt as you go",
        "Control, govern", "Latitude, freedom"
    ]
    count = 0

    for index in range(0, len(fourth_questions), 2):
        print(f"A. {fourth_questions[index]} \t\t  B. {fourth_questions[index + 1]}")

        answer = input().upper()
        while answer not in ('A', 'B'):
            print("You must select between A or B")
            answer = input().upper()

        if answer == "A":
           fourth_questions_answer.append("A. " + fourth_questions[index])
        else:
            fourth_questions_answer.append("B. " + fourth_questions[index + 1])
        count += 1


def first_display_message():
    no_of_a = 0
    no_of_b = 0

    for index in range (len(first_questions_answer)):
        print (first_questions_answer[index])

        if first_questions_answer[index].startswith('A'):
            no_of_a += 1
        elif first_questions_answer[index].startswith('B'):
            no_of_b += 1

    print("Number of A selected: ", no_of_a)
    print("Number of B selected: ", no_of_b)
    print()

    if no_of_a > no_of_b:
        personality_type.append("E")
    else:
        personality_type.append("I")

def second_display_message():
    no_of_a = 0
    no_of_b = 0

    for index in range (len(second_questions_answer)):
        print (second_questions_answer[index])

        if second_questions_answer[index].startswith('A'):
            no_of_a += 1
        elif second_questions_answer[index].startswith('B'):
            no_of_b += 1

    print("Number of A selected: ", no_of_a)
    print("Number of B selected: ", no_of_b)
    print()

    if no_of_a > no_of_b:
        personality_type.append("S")
    else:
        personality_type.append("N")

def third_display_message():
    no_of_a = 0
    no_of_b = 0

    for index in range (len(third_questions_answer)):
        print (third_questions_answer[index])

        if third_questions_answer[index].startswith('A'):
            no_of_a += 1
        elif third_questions_answer[index].startswith('B'):
            no_of_b += 1

    print("Number of A selected: ", no_of_a)
    print("Number of B selected: ", no_of_b)
    print()

    if no_of_a > no_of_b:
        personality_type.append("T")
    else:
        personality_type.append("F")

def fourth_display_message():
    no_of_a = 0
    no_of_b = 0

    for index in range (len(fourth_questions_answer)):
        print (fourth_questions_answer[index])

        if fourth_questions_answer[index].startswith('A'):
            no_of_a += 1
        elif fourth_questions_answer[index].startswith('B'):
            no_of_b += 1

    print("Number of A selected: ", no_of_a)
    print("Number of B selected: ", no_of_b)
    print()

    if no_of_a > no_of_b:
        personality_type.append("J")
    else:
        personality_type.append("P")

def display_personality_trait():
     if personality_type[0] == "I" and personality_type[1] == "N" and personality_type[2] == "T" and personality_type[3] == "J":
        print ("INTJ\n\tArchitect\n\tA Pioneering Spirit\n\tA Thirst for Knowledge\n")
        print ("The INTJ Personality Type\nIt can be lonely at the top. As one of the rarest personality types – and one of the most capable – Architects (INTJs) know this all too well. Rational and quick-witted, Architects pride themselves on their ability to think for themselves, not to mention their uncanny knack for seeing right through phoniness and hypocrisy. But because their minds are never at rest, Architects may struggle to find people who can keep up with their nonstop analysis of everything around them. Architects question everything. Many personality types trust the status quo, relying on conventional wisdom and other people’s expertise to guide their lives. But ever-skeptical Architects prefer to make their own discoveries. In their quest to find better ways of doing things, they aren’t afraid to break the rules or risk disapproval – in fact, they rather enjoy it. But as anyone with this personality type would tell you, a new idea isn’t worth anything unless it actually works. Architects want to be successful, not just inventive. They bring a single-minded drive to their work, applying the full force of their insight, logic, and willpower. And heaven help anyone who tries to slow them down by enforcing pointless rules or offering poorly thought-out criticism. Architects can be both the boldest of dreamers and the bitterest of pessimists. They believe that, through willpower and intelligence, they can achieve even the most challenging goals. But these personalities may be cynical about human nature more generally, assuming that most people are lazy, unimaginative, or simply doomed to mediocrity. People with the Architect personality type derive much of their self-esteem from their knowledge and mental acuity. In school, they may have been called “bookworms” or “nerds.” But rather than taking these labels as insults, many Architects embrace them. They recognize their own ability to teach themselves about – and master – any topic that interests them, whether that’s coding or capoeira or classical music.\n");
        print ("What does INTJ Stand for?\nAn Architect (INTJ) is a person with the Introverted, Intuitive, Thinking, and Judging personality traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one. Architects, independent to the core, want to shake off other people’s expectations and pursue their own ideas. Architects don’t just learn new things for show – they genuinely enjoy expanding the limits of their knowledge.")

     elif personality_type[0] == "I" and personality_type[1] == "N" and personality_type[2] == "T" and personality_type[3] == "P":
        print ("INTP\n\tLogician\n\tThe life of the Mind\n\tMysteries of the Universe\n")
        print ("The INTP Personality Type\nLogicians pride themselves on their unique perspectives and vigorous intellect. They can’t help but puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers and scientists of all time have been Logicians. This personality type is fairly rare, but with their creativity and inventiveness, Logicians aren’t afraid to stand out from the crowd. Logicians often lose themselves in thought – which isn’t necessarily a bad thing. People with this personality type hardly ever stop thinking. From the moment they wake up, their minds buzz with ideas, questions, and insights. At times, they may even find themselves conducting full-fledged debates in their own heads. Logicians love to analyze patterns. Without necessarily knowing how they do it, people with this personality type often have a Sherlock Holmes–like knack for spotting discrepancies and irregularities. In other words, it’s a bad idea to lie to them. Ironically, Logicians shouldn’t always be held at their word. They rarely mean to be dishonest, but with their active minds, they sometimes overflow with ideas and theories that they haven’t thought through all the way. They may change their mind on anything from their weekend plans to a fundamental moral principle, without ever realizing that they’d appeared to have made up their mind in the first place. In addition, they are often happy to play devil’s advocate in order to keep an interesting discussion humming along. People with this personality type want to understand everything in the universe, but one area in particular tends to mystify them: human nature. As their name suggests, Logicians feel most at home in the realm of logic and rationality. As a result, they can find themselves baffled by the illogical, irrational ways that feelings and emotions influence people’s behavior – including their own. This doesn’t mean that Logicians are unfeeling. These personalities generally want to offer emotional support to their friends and loved ones, but they don’t necessarily know how. And because they can’t decide on the best, most efficient way to offer support, they may hold off on doing or saying anything at all.\n")
        print ("What does INTP Stand for?\nA Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity. Imaginative and curious, Logician personalities can find endless fascination in the workings of their own mind. For Logicians, the best conversations are like brainstorming sessions, with plenty of room for unconventional thoughts and off-the-wall what-ifs.")

     elif personality_type[0] == "E" and personality_type[1] == "N" and personality_type[2] == "T" and personality_type[3] == "J":
        print ("ENTJ\n\tCommander\n\tStriving for Greatness\n\tA Worthy Challenge\n")
        print ("The ENTJ Personality Type\nCommanders are natural-born leaders. People with this personality type embody the gifts of charisma and confidence, and project authority in a way that draws crowds together behind a common goal. However, Commanders are also characterized by an often ruthless level of rationality, using their drive, determination and sharp minds to achieve whatever end they’ve set for themselves. Perhaps it is best that they make up only three percent of the population, lest they overwhelm the more timid and sensitive personality types that make up much of the rest of the world – but we have Commanders to thank for many of the businesses and institutions we take for granted every day. If there’s anything Commanders love, it’s a good challenge, big or small, and they firmly believe that given enough time and resources, they can achieve any goal. This quality makes people with the Commander personality type brilliant entrepreneurs, and their ability to think strategically and hold a long-term focus while executing each step of their plans with determination and precision makes them powerful business leaders. This determination is often a self-fulfilling prophecy, as Commanders push their goals through with sheer willpower where others might give up and move on, and their Extraverted (E) nature means they are likely to push everyone else right along with them, achieving spectacular results in the process. Emotional expression isn’t the strong suit of any Analyst type, but Commanders’ distance from their emotions is especially public, and felt directly by a much broader swath of people. Especially in a professional environment, Commanders will simply crush the sensitivities of those they view as inefficient, incompetent or lazy. To people with the Commander personality type, emotional displays are displays of weakness, and it’s easy to make enemies with this approach – Commanders will do well to remember that they absolutely depend on having a functioning team, not just to achieve their goals, but for their validation and feedback as well, something Commanders are, curiously, very sensitive to.\n")
        print ("What does ENTJ Stand for?\nA Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits. They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them. The underlying thought running through the Commander mind might be something like 'I don’t care if you call me an insensitive b*****d, as long as I remain an efficient b*****d'.")

     elif personality_type[0] == "E" and personality_type[1] == "N" and personality_type[2] == "T" and personality_type[3] == "P":
        print ("ENTP\n\tDebater\n\tBreaking the Rules\n\tThe Cost of Contrarianism\n")
        print ("The ENTP Personality Type\nQuick-witted and audacious, Debaters aren’t afraid to disagree with the status quo. In fact, they’re not afraid to disagree with pretty much anything or anyone. Few things light up people with this personality type more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better. It would be a mistake, though, to think of Debaters as disagreeable or mean-spirited. Instead, people with this personality type are knowledgeable and curious, with a playful sense of humor, and they can be incredibly entertaining. They simply have an offbeat, contrarian idea of fun – one that involves a healthy dose of spirited debate. Debaters are known for their rebellious streak. For this personality type, no belief is too sacred to be questioned, no idea is too fundamental to be scrutinized, and no rule is too important to be broken, or at least thoroughly tested. Sometimes Debaters even rebel against their own beliefs by arguing the opposing viewpoint – just to see how the world looks from the other side. As Debaters see it, most people are too ready to do as they’re told and blindly conform to social norms, pressures, and standards. Debaters enjoy the mental exercise of questioning the prevailing mode of thought, and they take a certain pleasure in uncovering the value of underdogs and outliers. Their active minds can’t help but rethink the things that everyone else takes for granted and push them in clever new directions. Debaters’ capacity for debate is legendary, but that doesn’t mean that it’s always helpful. When they openly question their boss in a meeting or pick apart everything their significant other says, Debaters may think that they’re being champions of rationality and logic. But they may also be doing their chances of success and happiness more harm than good. Not every occasion calls for this personality type’s default contrarianism, and most people can only stand to have their beliefs questioned and their feelings brushed aside for so long. As a result, Debaters may find that their quarrelsome fun burns many bridges, often inadvertently. Debaters are respected for their vision, confidence, knowledge, and keen sense of humor – but unless they cultivate a bit of sensitivity, they may struggle to maintain deeper relationships or even to achieve their professional goals.\n")
        print ("What does ENTP Stand for?\nA Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter. Debaters are the ultimate devil’s advocates, thriving on the process of shredding arguments and beliefs and letting the ribbons drift in the wind for all to see. For many Debaters, one of life’s greatest challenges is to translate their wide-ranging intellectual energy into real-world achievements and contributions.")

     elif personality_type[0] == "I" and personality_type[1] == "N" and personality_type[2] == "F" and personality_type[3] == "J":
        print ("INFJ\n\tAdvocate\n\tSeeking Purpose\n\tConnecting with Others (and Themselves)\n")
        print ("The INFJ Personality Type\nAdvocates (INFJs) may be the rarest personality type of all, but they certainly leave their mark on the world. Idealistic and principled, they aren’t content to coast through life – they want to stand up and make a difference. For Advocate personalities, success doesn’t come from money or status but from seeking fulfillment, helping others, and being a force for good in the world. While they have lofty goals and ambitions, Advocates shouldn’t be mistaken for idle dreamers. People with this personality type care about integrity, and they’re rarely satisfied until they’ve done what they know to be right. Conscientious to the core, they move through life with a clear sense of their values, and they aim never to lose sight of what truly matters – not according to other people or society at large, but according to their own wisdom and intuition. Perhaps because their personality type is so uncommon, Advocates tend to carry around a sense – whether conscious or not – of being different from most people. With their rich inner lives and their deep, abiding desire to find their life purpose, they don’t always fit in with those around them. This isn’t to say that Advocates can’t enjoy social acceptance or close relationships – only that they sometimes feel misunderstood or at odds with the world. Fortunately, this sense of being out of step doesn’t diminish Advocates’ commitment to making the world a better place. Advocates are troubled by injustice, and they typically care more about altruism than personal gain. They often feel called to use their strengths – including creativity, imagination, and sensitivity – to uplift others and spread compassion. Advocates may be Introverted, but they value deep, authentic relationships with others. Few things bring these personalities as much joy as truly knowing another person – and being known in return. Advocates enjoy meaningful conversations far more than small talk, and they tend to communicate in a way that is warm and sensitive. This emotional honesty and insight can make a powerful impression on the people around them. Many Advocates feel that their life has a unique purpose – a mission that they were put onto this earth to fulfill. For people with this personality type, one of the most rewarding aspects of life is seeking out this purpose – and then, once they’ve found it, striving to do it justice.\n")
        print ("What does INFJ Stand for?\nAn Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things. Nothing lights up Advocates like changing someone else’s life for the better.")

     elif personality_type[0] == "I" and personality_type[1] == "N" and personality_type[2] == "F" and personality_type[3] == "P":
        print ("INFP\n\tMediator\n\tThe Gift of Empathy\n\tSpeaking Their Truth\n")
        print ("The INFP Personality Type\nAlthough they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives. Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories and conversations in their minds. These personalities are known for their sensitivity – Mediators can have profound emotional responses to music, art, nature, and the people around them. Idealistic and empathetic, Mediators long for deep, soulful relationships, and they feel called to help others. But because this personality type makes up such a small portion of the population, Mediators may sometimes feel lonely or invisible, adrift in a world that doesn’t seem to appreciate the traits that make them unique. Mediators share a sincere curiosity about the depths of human nature. Introspective to the core, they’re exquisitely attuned to their own thoughts and feelings, but they yearn to understand the people around them as well. Mediators are compassionate and nonjudgmental, always willing to hear another person’s story. When someone opens up to them or turns to them for comfort, they feel honored to listen and be of help. Empathy is among this personality type’s greatest gifts, but at times it can be a liability. The troubles of the world weigh heavily on Mediators’ shoulders, and these personalities can be vulnerable to internalizing other people’s negative moods or mindsets. Unless they learn to set boundaries, Mediators may feel overwhelmed by just how many wrongs there are that need to be set right. Few things make Mediators more uneasy than pretending to be someone they aren’t. With their sensitivity and their commitment to authenticity, people with this personality type tend to crave opportunities for creative self-expression. It comes as no surprise, then, that many famous Mediators are poets, writers, actors, and artists. They can’t help but muse about the meaning and purpose of life, dreaming up all sorts of stories, ideas, and possibilities along the way. People with this personality type tend to feel directionless or stuck until they connect with a sense of purpose for their lives. For many Mediators, this purpose has something to do with uplifting others and their ability to feel other people’s suffering as if it were their own. While Mediators want to help everyone, they need to focus their energy and efforts – otherwise, they can end up exhausted. Fortunately, like flowers in the spring, Mediators’ creativity and idealism can bloom even after the darkest of seasons. Although they know the world will never be perfect, Mediators still care about making it better however they can. This quiet belief in doing the right thing may explain why these personalities so often inspire compassion, kindness, and beauty wherever they go.\n")
        print ("What does INFP Stand for?\nA Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits. These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do. For Mediators, an ideal relationship of any kind is one in which both people feel comfortable sharing not just their wildest hopes and dreams but also their secret fears and vulnerabilities. Mediators have a talent for self-expression. They may reveal their innermost thoughts and secrets through metaphors and fictional characters.")

     elif personality_type[0] == "E" and personality_type[1] == "N" and personality_type[2] == "F" and personality_type[3] == "J":
        print ("ENFJ\n\tProtagonist\n\tSpeaking Up for What’s Right\n\tLeading the Way\n")
        print ("The ENFJ Personality Type\nProtagonists (ENFJs) feel called to serve a greater purpose in life. Thoughtful and idealistic, these personality types strive to have a positive impact on other people and the world around them. They rarely shy away from an opportunity to do the right thing, even when doing so is far from easy. Protagonists are born leaders, which explains why these personalities can be found among many notable politicians, coaches, and teachers. Their passion and charisma allow them to inspire others not just in their careers but in every arena of their lives, including their relationships. Few things bring Protagonists a deeper sense of joy and fulfillment than guiding friends and loved ones to grow into their best selves. Protagonists tend to be vocal about their values, including authenticity and altruism. When something strikes them as unjust or wrong, they speak up. But they rarely come across as brash or pushy, as their sensitivity and insight guide them to speak in ways that resonate with others. These personality types have an uncanny ability to pick up on people’s underlying motivations and beliefs. At times, they may not even understand how they come to grasp another person’s mind and heart so quickly. These flashes of insight can make Protagonists incredibly persuasive and inspiring communicators. When Protagonists care about someone, they want to help solve that person’s problems – sometimes at any cost. The good news is that many people are grateful for Protagonists’ assistance and advice. After all, there’s a reason that these personalities have a reputation for helping others improve their lives. People with this personality type are devoted altruists, ready to face slings and arrows in order to stand up for the people and ideas that they believe in. This strength of conviction bolsters Protagonists’ innate leadership skills, particularly their ability to guide people to work together in service of the greater good. But their greatest gift might actually be leading by example. In their day-to-day lives, Protagonists reveal how seemingly ordinary situations can be handled with compassion, dedication, and care. For these personalities, even the smallest daily choices and actions – from how they spend their weekend to what they say to a coworker who is struggling – can become an opportunity to lead the way to a brighter future.\n")
        print ("What does ENFJ Stand for?\nA Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits. These warm, forthright types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals. Changing people’s minds is no easy task – but if anyone can do it, it’s Protagonists. Protagonists are genuine, caring people who talk the talk and walk the walk. Nothing makes them happier than motivating other people to do what’s right.")

     elif personality_type[0] == "E" and personality_type[1] == "N" and personality_type[2] == "F" and personality_type[3] == "P":
        print ("ENFP\n\tCampaigner\n\tThe Magic of Everyday Life\n\tSeeking Joy\n")
        print ("The ENFP Personality Type\nCampaigners (ENFPs) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life, they stand out in any crowd. But even though they can be the life of the party, Campaigners don’t just care about having a good time. These personality types run deep – as does their longing for meaningful, emotional connections with other people. Friendly and outgoing, Campaigners are devoted to enriching their relationships and their social lives. But beneath their sociable, easygoing exteriors, they have rich, vibrant inner lives as well. Without a healthy dose of imagination, creativity, and curiosity, a Campaigner simply wouldn’t be a Campaigner. In their unique way, Campaigners can be quite introspective. They can’t help but ponder the deeper meaning and significance of life – even when they should be paying attention to something else. These personalities believe that everything – and everyone – is connected, and they live for the glimmers of insight that they can gain into these connections. Campaigners are proof that seeking out life’s joys and pleasures isn’t the same as being shallow. Seemingly in the blink of an eye, people with this personality type can transform from impassioned idealists to carefree figures on the dance floor. Even in moments of fun, Campaigners want to connect emotionally with others. Few things matter more to these personality types than having genuine, heartfelt conversations with the people they cherish. Campaigners believe that everyone deserves to express their feelings, and their empathy and warmth create spaces where even the most timid spirits can feel comfortable opening up. People with this personality type need to be careful, however. Campaigners’ intuition may lead them to read far too much into other people’s actions and behaviors. Instead of simply asking for an explanation, Campaigners may end up puzzling over someone else’s desires or intentions. This kind of social stress is what keeps harmony-focused Campaigners awake at night.\n")
        print ("What does ENFP Stand for?\nA Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits. These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions. Campaigners are independent and creative, always on the lookout for the magic and meaning in everyday life. Campaigner personalities are capable of intense thought and feeling – and also of kicking back and having a good time.")

     elif personality_type[0] == "I" and personality_type[1] == "S" and personality_type[2] == "T" and personality_type[3] == "J":
        print ("ISTJ\n\tLogistician\n\tA Life of Integrity\n\tPicking Up the Slack\n")
        print ("The ISTJ Personality Type\nLogisticians pride themselves on their integrity. People with this personality type mean what they say, and when they commit to doing something, they make sure to follow through. This personality type makes up a good portion of the overall population, and while Logisticians may not be particularly flashy or attention-seeking, they do more than their share to keep society on a sturdy, stable foundation. In their families and their communities, Logisticians often earn respect for their reliability, their practicality, and their ability to stay grounded and logical, even in the most stressful situations. The core of Logisticians’ self-respect comes from a sense of personal integrity. People with this personality type believe that there is a right way to proceed in any situation – and that anyone who pretends otherwise is probably trying to bend the rules to suit their own purposes. Logisticians have a deep respect for structure and tradition, and they are often drawn to organizations, workplaces, and educational settings that offer clear hierarchies and expectations. Logisticians’ dedication is an admirable quality, and it drives many of their accomplishments. But it can also become a weakness that other people take advantage of. With their strong work ethic and sense of duty, Logisticians may routinely find themselves shouldering other people’s responsibilities. Even if they don’t complain about the situation, Logisticians can end up exhausted or discouraged if they’re constantly expected – or taking it upon themselves – to pick up the slack for their colleagues, friends, or loved ones. Logisticians aren’t known for expressing their emotions readily, but that doesn’t mean that people with this personality type don’t feel frustration or resentment when they’re pulling more than their weight. And unless they make sure that their relationships are balanced and sustainable, Logisticians may end up compromising the very stability that they feel called to protect. The good news is that, by learning to set appropriate boundaries and speak up when they’re overstretched, Logisticians can offer the world the full benefit of their many gifts, including their clarity, their loyalty, and their dependability.\n")
        print ("What does ISTJ Stand for?\nA Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose. In a world where many people shirk their responsibilities or say what they think others want to hear, Logisticians stand out as dedicated, responsible, and honest. For many Logisticians, a lack of structure offers not freedom, but chaos.")

     elif personality_type[0] == "I" and personality_type[1] == "S" and personality_type[2] == "F" and personality_type[3] == "J":
        print ("ISFJ\n\tDefender\n\tThe Gift of Loyalty\n\tShowing Up for Others – and Themselves\n")
        print ("The ISFJ Personality Type\nIn their unassuming, understated way, Defenders help make the world go round. Hardworking and devoted, people with this personality type feel a deep sense of responsibility to those around them. Defenders can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes. This is a capable, can-do personality type, with a wealth of versatile gifts. Though sensitive and caring, Defenders also have excellent analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social relationships. Defenders are truly more than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives. Among Defenders’ most distinctive traits is loyalty. Rare is the Defender who allows a friendship or relationship to fade away from lack of effort. Instead, they invest a great deal of energy into maintaining strong connections with their loved ones – and not just by sending “How are you doing?” texts. People with this personality type are known for dropping everything and lending a hand whenever a friend or family member is going through a hard time. For Defenders, “good enough” is rarely good enough. People with this personality type can be meticulous to the point of perfectionism. They take their responsibilities personally, consistently going above and beyond and doing everything that they can to exceed others’ expectations. Although they’re Introverted, Defenders have a deeply social nature. Thanks to their ability to remember the details of other people’s lives, Defenders have a special talent for making their friends and acquaintances feel seen, known, and cherished. Few personality types can match Defenders’ ability to choose just the right gift for any occasion, whether large or small. Dedicated and thoughtful, Defenders find great joy in helping those around them build stable, secure, and happy lives. It may not be easy for people with this personality type to show up for themselves in the way that they show up for other people, but when they do, they often find themselves with even more energy and motivation to do good in the world.\n")
        print ("What does ISFJ Stand for?\nA Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits. These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives. Defenders are true altruists, meeting kindness with kindness-in-excess and engaging with the work and people they believe in with enthusiasm and generosity. Defenders tend to feel most energized and effective when they’re showing up for someone who needs their help.")

     elif personality_type[0] == "E" and personality_type[1] == "S" and personality_type[2] == "T" and personality_type[3] == "J":
        print ("ESTJ\n\tExecutive\n\tLeading by Example\n\tA Greater Responsibility\n")
        print ("The ESTJ Personality Type\nExecutives are representatives of tradition and order, utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities together. Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear advice and guidance, and they happily lead the way on difficult paths. Taking pride in bringing people together, Executives often take on roles as community organizers, working hard to bring everyone together in celebration of cherished local events, or in defense of the traditional values that hold families and communities together. Demand for such leadership is high in democratic societies, and forming no less than 11% of the population, it’s no wonder that many of America’s presidents have been Executives. Strong believers in the rule of law and authority that must be earned, Executive personalities lead by example, demonstrating dedication and purposeful honesty, and an utter rejection of laziness and cheating, especially in work. If anyone declares hard, manual work to be an excellent way to build character, it is Executives. Executives are aware of their surroundings and live in a world of clear, verifiable facts – the surety of their knowledge means that even against heavy resistance, they stick to their principles and push an unclouded vision of what is and is not acceptable. Their opinions aren’t just empty talk either, as Executives are more than willing to dive into the most challenging projects, improving action plans and sorting details along the way, making even the most complicated tasks seem easy and approachable. The main challenge for Executives is to recognize that not everyone follows the same path or contributes in the same way. A true leader recognizes the strength of the individual, as well as that of the group, and helps bring those individuals’ ideas to the table. That way, Executives really do have all the facts, and are able to lead the charge in directions that work for everyone.\n")
        print ("What does ESTJ Stand for?\nAn Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits. They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity. Executives are classic images of the model citizen: they help their neighbors, uphold the law, and try to make sure that everyone participates in the communities and organizations they hold so dear.")

     elif personality_type[0] == "E" and personality_type[1] == "S" and personality_type[2] == "F" and personality_type[3] == "J":
        print ("ESFJ\n\tConsul\n\tThe Beauty of a Responsible Life\n\tBuilding Relationships That Last\n")
        print ("The ESFJ Personality Type\nFor Consuls, life is sweetest when it’s shared with others. People with this personality type form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors. This doesn’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those around them. Generous and reliable, people with this personality type often take it upon themselves – in ways both large and small – to hold their families and their communities together. Consuls are altruists. They take seriously their responsibilities to give back, serve others, and do the right thing. And Consuls believe that there is a clear right thing to do in nearly every situation. While some personality types adopt a more lenient, live-and-let-live attitude, Consuls may find it difficult not to judge when someone takes a path that strikes them as misguided. As a result, Consuls often struggle to accept it when someone – particularly someone they care about – disagrees with them. Supportive and outgoing, Consuls can always be spotted at a party – they’re the ones fluttering around making sure that everyone else is having a good time! But make no mistake: Consuls don’t just breeze through other people’s lives. Loyal to the core, they build lasting relationships, and they can be counted on to show up whenever a helping hand – or a listening ear – is needed. With their love of order and structure, Consuls prefer planned events to open-ended activities or spontaneous get-togethers – and they’re happy to host in order to ensure that everything goes smoothly. People with this personality type put a great deal of energy into making other people feel special and celebrated, and they may take it personally when someone doesn’t seem to appreciate their efforts.\n")
        print ("What does ESFJ Stand for?\nA Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits. They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others. Consuls have a talent for making the people in their lives feel supported, cared for, and secure. Consuls have a clear moral compass – and it can be nothing short of baffling to them when other people’s actions don’t align with it.")

     elif personality_type[0] == "I" and personality_type[1] == "S" and personality_type[2] == "T" and personality_type[3] == "P":
        print ("ISTP\n\tVirtuoso\n\tDare to Differ\n\tDefying the Rules\n")
        print ("The ISTP Personality Type\nFor Consuls, life is sweetest when it’s shared with others. People with this personality type form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors. This doesn’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those around them. Generous and reliable, people with this personality type often take it upon themselves – in ways both large and small – to hold their families and their communities together. Consuls are altruists. They take seriously their responsibilities to give back, serve others, and do the right thing. And Consuls believe that there is a clear right thing to do in nearly every situation. While some personality types adopt a more lenient, live-and-let-live attitude, Consuls may find it difficult not to judge when someone takes a path that strikes them as misguided. As a result, Consuls often struggle to accept it when someone – particularly someone they care about – disagrees with them. Supportive and outgoing, Consuls can always be spotted at a party – they’re the ones fluttering around making sure that everyone else is having a good time! But make no mistake: Consuls don’t just breeze through other people’s lives. Loyal to the core, they build lasting relationships, and they can be counted on to show up whenever a helping hand – or a listening ear – is needed. With their love of order and structure, Consuls prefer planned events to open-ended activities or spontaneous get-togethers – and they’re happy to host in order to ensure that everything goes smoothly. People with this personality type put a great deal of energy into making other people feel special and celebrated, and they may take it personally when someone doesn’t seem to appreciate their efforts.\n")
        print ("What does ISTP Stand for?\nA Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed. Rather than some sort of vision quest though, Virtuosos are merely exploring the viability of a new interest when they make these seismic shifts.")

     elif personality_type[0] == "I" and personality_type[1] == "S" and personality_type[2] == "F" and personality_type[3] == "P":
        print ("ISFP\n\tAdventurer\n\tThe Beauty of an Open Mind\n\tLiving in Harmony\n")
        print ("The ISFP Personality Type\nAdventurers are true artists – although not necessarily in the conventional sense. For this personality type, life itself is a canvas for self-expression. From what they wear to how they spend their free time, Adventurers act in ways that vividly reflect who they are as unique individuals. And every Adventurer is certainly unique. Driven by curiosity and eager to try new things, people with this personality often have a fascinating array of passions and interests. With their exploratory spirits and their ability to find joy in everyday life, Adventurers can be among the most interesting people you’ll ever meet. The only irony? Unassuming and humble, Adventurers tend to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are. Adventurers embrace a flexible, adaptable approach to life. Some personality types thrive on strict schedules and routines – but not Adventurers. Adventurers take each day as it comes, doing what feels right to them in the moment. And they make sure to leave plenty of room in their lives for the unexpected – with the result that many of their most cherished memories are of spontaneous, spur-of-the-moment outings and adventures, whether by themselves or with their loved ones. This flexible mindset makes Adventurers remarkably tolerant and open-minded. These personalities genuinely love living in a world filled with all kinds of people – even people who disagree with them or choose radically different lifestyles. It’s no surprise, then, that Adventurers are unusually open to changing their minds and rethinking their opinions. If any personality type believes in giving something (or someone) a second chance, it’s Adventurers. In their relationships, Adventurers are warm, friendly, and caring, taking wholehearted enjoyment in the company of their nearest and dearest. But make no mistake: this is an Introverted personality type, meaning that Adventurers need dedicated alone time to recharge their energy after socializing with others. This alone time is what allows Adventurers to reestablish a sense of their own identity – in other words, to reconnect with who they truly are. Creative and free-spirited, Adventurers march to the beat of their own drum, and it would be easy to assume that they don’t particularly worry what other people think of them. But this isn’t the case – Adventurers are thoughtful and perceptive, able to pick up on people’s unspoken feelings and opinions, and it can upset them if they don’t feel liked, approved of, or appreciated. When faced with criticism, it can be a challenge for people with this personality type not to get caught up in the heat of the moment. If they encounter harsh or seemingly unfair criticism, they may even lose their tempers in spectacular fashion.\n")
        print ("What does ISFP Stand for?\nAn Adventurer (ISFP) is a person with the Introverted, Observant, Feeling, and Prospecting personality traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials. Adventurers want to live in a world where they – and everyone else – have the freedom to live as they see fit, without judgment.")

     elif personality_type[0] == "E" and personality_type[1] == "S" and personality_type[2] == "T" and personality_type[3] == "P":
        print ("ESTP\n\tEntrepreneur\n\tDiving Right In\n\tThe Path Less Traveled\n")
        print ("The ESTP Personality Type\nEntrepreneurs always have an impact on their immediate surroundings – the best way to spot them at a party is to look for the whirling eddy of people flitting about them as they move from group to group. Laughing and entertaining with a blunt and earthy humor, Entrepreneur personalities love to be the center of attention. If an audience member is asked to come on stage, Entrepreneurs volunteer – or volunteer a shy friend. Theory, abstract concepts and plodding discussions about global issues and their implications don’t keep Entrepreneurs interested for long. Entrepreneurs keep their conversation energetic, with a good dose of intelligence, but they like to talk about what is – or better yet, to just go out and do it. Entrepreneurs leap before they look, fixing their mistakes as they go, rather than sitting idle, preparing contingencies and escape clauses. Entrepreneurs are the likeliest personality type to make a lifestyle of risky behavior. They live in the moment and dive into the action – they are the eye of the storm. People with the Entrepreneur personality type enjoy drama, passion, and pleasure, not for emotional thrills, but because it’s so stimulating to their logical minds. They are forced to make critical decisions based on factual, immediate reality in a process of rapid-fire rational stimulus response. This makes school and other highly organized environments a challenge for Entrepreneurs. It certainly isn’t because they aren’t smart, and they can do well, but the regimented, lecturing approach of formal education is just so far from the hands-on learning that Entrepreneurs enjoy. It takes a great deal of maturity to see this process as a necessary means to an end, something that creates more exciting opportunities. With perhaps the most perceptive, unfiltered view of any type, Entrepreneurs have a unique skill in noticing small changes. Whether a shift in facial expression, a new clothing style, or a broken habit, people with this personality type pick up on hidden thoughts and motives where most types would be lucky to pick up anything specific at all. Entrepreneurs use these observations immediately, calling out the change and asking questions, often with little regard for sensitivity. Entrepreneurs should remember that not everyone wants their secrets and decisions broadcast.\n")
        print ("What does ESTP Stand for?\nAn Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits. They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits. Sometimes Entrepreneurs’ instantaneous observation and action is just what’s required, as in some corporate environments, and especially in emergencies.")

     elif personality_type[0] == "E" and personality_type[1] == "S" and personality_type[2] == "F" and personality_type[3] == "P":
        print ("ESFP\n\tEntertainer\n\tLiving with Passion\n\tA Spontaneous Spirit\n")
        print ("The ESFP Personality Type\nIf anyone is to be found spontaneously breaking into song and dance, it is the Entertainer personality type. Entertainers get caught up in the excitement of the moment, and want everyone else to feel that way, too. No other personality type is as generous with their time and energy as Entertainers when it comes to encouraging others, and no other personality type does it with such irresistible style. Entertainers love the spotlight, and all the world’s a stage. Many famous people with the Entertainer personality type are indeed actors, but they love putting on a show for their friends too, chatting with a unique and earthy wit, soaking up attention and making every outing feel a bit like a party. Utterly social, Entertainers enjoy the simplest things, and there’s no greater joy for them than just having fun with a good group of friends. It’s not just talk either – Entertainers have the strongest aesthetic sense of any personality type. From grooming and outfits to a well-appointed home, Entertainer personalities have an eye for fashion. Knowing what’s attractive the moment they see it, Entertainers aren’t afraid to change their surroundings to reflect their personal style. Entertainers are naturally curious, exploring new designs and styles with ease. The biggest challenge Entertainers face is that they are often so focused on immediate pleasures that they neglect the duties and responsibilities that make those luxuries possible. Complex analysis, repetitive tasks, and matching statistics to real consequences are not easy activities for Entertainers. They’d rather rely on luck or opportunity, or simply ask for help from their extensive circle of friends. It is important for Entertainers to challenge themselves to keep track of long-term things like their retirement plans or sugar intake – there won’t always be someone else around who can help to keep an eye on these things. Entertainers recognize value and quality, which on its own is a fine trait. In combination with their tendency to be poor planners though, this can cause them to live beyond their means, and credit cards are especially dangerous. More focused on leaping at opportunities than in planning out long-term goals, Entertainers may find that their inattentiveness has made some activities unaffordable.\n")
        print ("What does ESFP Stand for?\nAn Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities. There’s nothing that makes Entertainers feel quite as unhappy as realizing that they are boxed in by circumstance, unable to join their friends.")


def main_app():
    name = input('What is your name? ')
    first_set_of_questions()
    second_set_of_questions()
    third_set_of_questions()
    fourth_set_of_questions()
    print(f"\nHello {name}, You selected")
    first_display_message()
    second_display_message()
    third_display_message()
    fourth_display_message()
    display_personality_trait()

main_app()