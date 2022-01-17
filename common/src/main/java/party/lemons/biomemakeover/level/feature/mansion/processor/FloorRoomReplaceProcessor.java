package party.lemons.biomemakeover.level.feature.mansion.processor;

import party.lemons.biomemakeover.level.feature.mansion.room.MansionRoom;
import party.lemons.biomemakeover.util.Grid;

import java.util.Random;

public abstract class FloorRoomReplaceProcessor
{
    public abstract boolean isValid(Random random, int floor, Grid<MansionRoom> grid, MansionRoom currentRoom);

    public abstract MansionRoom getReplaceRoom(MansionRoom currentRoom);
}