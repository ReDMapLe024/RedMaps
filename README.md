# RedMaps
    RedMaps is a Random/procedural map generator that allows you to pick and choose the 
    dimensions and other aspects of your map such as frequencies and complexity of your map. 
    This tool also allows you to use your own custom tileset that you would like to use with the map.
    You can also export your maps into a txt format and integrate it with your own game.
    
# VERSION 0.0.2

#    0.0.2
        - Added GUI frame and GUI components to insert values for the map;
        - You can now import your own tileSets... Must follow guideline for now 
          which is the following:
                - TileSets must begin at (0,0);
                - Tiles must all be of Equal size (No stacked Tiles);
        - Made code more modular to improve reusability.
    
#    0.0.1 
        - DiamondSquare Alogrithm for map generation
        - Map smoothing to prevent "rogue" single tiles
        - Lake edge, border and corner tile functions to
         add them on the map
        - More to follow.../
    
    
#    Bugs/Problems:
        - Water corners are being added in areas that have no water.
        - Terrain does not seem to gradually change. Variation in height is to great
          and causes sharp changes in landscape.
        - Terrain smoothing is also not working in some cases.
