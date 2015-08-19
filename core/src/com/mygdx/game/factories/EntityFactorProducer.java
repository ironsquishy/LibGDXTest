package com.mygdx.game.factories;

/**
 * Created by admin on 8/18/2015.
 */
public class EntityFactorProducer {

    private static EntityFactorProducer mEntityFactory = null;

    private static final int DIVER_FACTORY = 0;
    private static final int TILE_FACTORY = 1;

    private EntityFactorProducer()
    {

    }

    public static EntityFactorProducer getInstance()
    {
        if(mEntityFactory == null)
        {
            return new EntityFactorProducer();
        }

        return mEntityFactory;
    }

    private EntityFactory getTypeFactory(final int FLAG)
    {
        if(FLAG == 0)
        {
            return new DiverFactory();

        }else if(FLAG == 1)
        {
            return new TileFactory();
        }

        return null;
    }

    public EntityFactory getDiverFactory()
    {
        return getTypeFactory(DIVER_FACTORY);
    }

    public EntityFactory getTileFactory()
    {
        return getTypeFactory(TILE_FACTORY);
    }

}
