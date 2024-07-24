int heart = 27641; //this is the upgraded heart (saturated)
int heart_slot = v.getInventory().slot(heart);

v.invoke("Invigorate","<col=ff9040>Saturated heart</col>",2,57,heart_slot,9764864,false);
v.invoke("Cast","<col=00ff00>Resurrect Greater Ghost</col>",1,57,-1,14287035,false); //uncomment if you want to use thrall instead
