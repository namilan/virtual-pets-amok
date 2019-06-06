05/30/19:

Created Gradle for eclipse. Imported project into eclipse. Created main and tests. 

05/31/19:

Added into GitHub.

06/01/19:

Added ReadMe to folder. Added ignore.git in the folder as well. Uploaded on to GIT. 
Added VirtualRobotPets class.
Added VirtualRobotPetsTest class. 
Gave values to everything that held a 0. 
	* Maintenance = 23
	* Oil = 50
	* Happiness = 50
	* Bored = 50
Removed " Clean " from VirtualPetsRobots. 
Fixed isPetCageCleanMethodWorking in VP
	* Set value to 25
Fixed isPetCageDirtyMethodWorking in VP
	* Set value to 25
Added doesUserPetSoilGetterWork to VPTest
	* set value to 50
Added soil to VP
	* set name to soil (return.soil)
	* set value to 50 / 100 ( onces hits 100, soils )
Added treat to VP & VPTest
	* set value to 1
	* return.treat
	* added isPetTreatGetterWorking to VPTest
	* set value == 1 in VP
Added isLitterBoxClean()
	* returning litterBox == 25
Added isLitterBoxDirty()
	* returning litterBox <= 25
Added getUserCatLitterBox()
	* returning litterBox
Added litterBox
	* set Value = 25 for clean
	* if litterBox hits 100, the cat will soil
	  it's cage

Added walkDog to VPet/VPTest
	* set Value = 25 ( will tick / if hits 100, dog
	  will mess his cage. )
Removed Clean from isAlive
	* moved to isSoiled
	* if pet gets hungry, bored, or thirsty, pet runs 	
	  away
Added isSoiled method
	* Created a " pet soiled the cage " string
	* added clean & litter box into this method
Added tickRestLitterBox() to VPTest
Added isLitterBoxTicking() to VPTest
**** checked testing and all is green and works ****
Added Tick Method Reset to VRPets
	* maintenance = 23
	* oil = 50
	* happiness = 50
	* bored = 50
Added Tick Method Reset to VRPTest
	* maintenance
	* oil
	* happiness
	* bored
Added isRobotAlive()
	* if robot hits 0, then robot powers down. 
Added is RobotBored
	* if robot hits 100, then robot breaks out of 
	  cage and rips up all papers in the office. 
Added Collection <VirtualRobotPets> in VRPets
	* returns robotValues()
Added List <virtualRobotPets> array list to VPShelter
Publiclist of getVirtualRobotPets
Added shouldReturnRobotPetName
	* in VPShelter & VPSTest = userPetName. 
Added the following; 
	* oil = 50
	* maintenance = 23
	* happy = 50
	* litterBox = 25
	* treat = 1
	* walking dog = 25

06/03/19 :

Added the printAllRoboPetNames in VPShelter
	* prints out a string of only robot names.
Added robotInPlayHouse in the VPAmok. 
Added the printAllRoboPetNames in VPAmok
	* works - prints out a separate line of robot pets. 
Added a Kitty Litter condition to the read out 
	* needing to go back into VP and make that an
	  option for only the cats and then taking the
	  cage condition away from the cats and making 
	  that only a dog function. 
Added the status for the robotic pets
	* name
	* maintenance
	* oil
	* happiness
Added more menu items and functions. 10 total. 
	* feed organic pets
	* oil the robotic pets
	* water organic pets
	* clean the dog cages
	* clean the kitty litter boxes
	* provide maintenance for robo pets
	* walk dogs
	* treat option
	* play with
	* adopt
	* admit
	* quit. 
Added robot functions in VPShelter
	* Tick function
	* oil function
Updated Tick Reset for organic pets
	* Resets the following
		- Clean Cage
		- Litter Box
Updated tick on Clean function when it ticks
	* set clean += 4 ( gen ran )
Added resetthirsthungertick
	* hunger = 0
	* thirst = 0
Added tick reset for LitterBox clean
	* reset = 0
Added tick reset for clean dog cages under "clean"
	* reset = 0
Added robotNeedingMaint to VPRobots
	* >= 23
Added robotNotNeedingMaint to VPRobots
	* <= 23
Added isRobotNeedingOil to VPRobots
	* >= 50
Added isRobotNotNeedingOil to VPRobots
	* <= 50
Changed my case numbers for my menu's in VPAmok
Added makeAllRoboPetsTickOilReset in VPShelter
	* .tickResetOil
Added tickResetOil in VPRobots
	* reset = 100 ( full amount )
Added areDogsNeedingWalked to VPShelter
	* made the makeAllPetTickCleanReset for the tick
	  result, due to dog being outside and cage gets
	  automatically cleaned. 
Added sout line to case 7: in VPAmok
	* "Lets take the floof dogs for a walk!"
	* "Doggos enjoyed the walk! Good job!"
Adding Case 8 in VPAmok
	* Added a treat function (giveATreat())
	* created a String for petNamesCurrent =
	  input.nextLine()
	* nameOrganic input
	* arePetsGettingATreat
	* ticks for makeAllPetsTick
Adding petNamesCurrent in VPShelter
Added the adopt function for the Robots in VPAmok
	* added petNamesCurrent ( currently in shelter )
	* able to import robot pets and take robots out of
	  the menu. 
Added a couple of text lines to the Case 11 menu. 
Adding case 12 to admit robot pets. 

06/04/19 : 

Added Cat Class
	* extends VirtualPet
Added Dog Class
	* extends VirtualPet
Added RobotCat Class
	* extends VirtualPet implements VirtualPetRobots
Added RobotDog Class
	* extends VirtualPet implements VirtualPetRobots
Removed VirtualPetRobots Class
	* Made interface Robotic instead
Interface Robitic Pet
	* ONLY Has the robotic features for BOTH
	  RobotCat/RobotDog
Fixing VirtualPetShelter.Java

--------------------
06/05/19 : 
I realized everything was pretty much broken in my original virtual-pets-amok-app. I completely scrapped the entire project. Installed gradle on my home PC and had restarted the entire project. 

Created Classes:
	* Cat
	* Dog
	* RobotCat
	* RobotDog
	* VirtualPet
	* VirtualPetShelter
	* VirtualPetsAmokApp
Created Interface:
	* Robotic
Removed:
	* All Tests. 
		- I can go back and add all testing methods. Eventually. 