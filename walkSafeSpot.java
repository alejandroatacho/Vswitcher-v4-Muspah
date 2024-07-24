WorldPoint safeSpot = new WorldPoint(6876, 4125, 0);
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();
if (!currentLocation.equals(safeSpot)) {
	
	v.getWalking().walk(safeSpot);
}
else if (!v.getWalking().isMoving() && currentLocation.equals(safeSpot) )
{
    NPC currentTarget = v.getCombat().npcTarget();
    v.getCombat().attackNpc(currentTarget);
}