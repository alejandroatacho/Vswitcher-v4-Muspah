int crossbowDecision = 0; //0 = Zaryte crossbow //1 = Dragon crossbow
int boltPouch = 1; // 0 = No, //1 Yes
int thralling = 1; // 0 = No, //1 Yes
int rBolt = 21944;
int slot = v.getInventory().slot(rBolt);
int bookSlot = v.getInventory().slot(25818);
if (crossbowDecision == 0) {
	
v.getPrayer().prayOn(Prayer.PROTECT_FROM_MISSILES);
v.getPrayer().prayOn(Prayer.RIGOUR);
if (boltPouch == 1) {
    if (slot >= 1){
        v.getInventory().equip(21944);
        v.invoke("Wear","<col=ff9040>Sapphire dragon bolts (e)</col>",1,57,-1,25362459,false);
    }
}
if (thralling == 1) {
v.invoke("Wield","<col=ff9040>Book of the dead</col>",2,57,bookSlot,9764864,false);
}
v.getInventory().equipOrder(26374,21940, 22109, 27238, 27241, 7462, 2224, 22249, 26235,27235,13237);
v.invoke("Cast","<col=00ff00>Greater Corruption</col>",1,57,-1,14287021,false);
v.getCombat().spec(1);
v.getTabs().open(Tab.PRAYER);

}
else if (crossbowDecision == 1) {
	

v.getPrayer().prayOn(Prayer.PROTECT_FROM_MISSILES);
v.getPrayer().prayOn(Prayer.RIGOUR);
v.getInventory().equipOrder(21902,21940, 22109, 27238, 27241, 7462, 2224, 22249, 26235,27235,13237);
v.invoke("Cast","<col=00ff00>Greater Corruption</col>",1,57,-1,14287021,false);
v.getTabs().open(Tab.PRAYER);

}