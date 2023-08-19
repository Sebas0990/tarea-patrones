public class DataBaseSims {
    public static String JSONDatabaseSim = "{" +
            "\n   'type':'FeatureCollection'," +
            "\n   'features':[" +
            "\n     {" +
            "\n       'Type': 'Feature'," +
            "\n       'properties':{}," +
            "\n       'geometry': {" +
            "\n         'coordinates';[";
    public static String KMLRecieveSim = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<kml xmlns=\"http://www.opengis.net/kml/2.2\">\n" +
            "  <Document>\n" +
            "    <name>Test kml</name>\n" +
            "    <description>casa de Lu</description>\n" +
            "    <Style id=\"icon-1899-0288D1-nodesc-normal\">\n" +
            "      <IconStyle>\n" +
            "        <color>ffd18802</color>\n" +
            "        <scale>1</scale>\n" +
            "        <Icon>\n" +
            "          <href>https://www.gstatic.com/mapspro/images/stock/503-wht-blank_maps.png</href>\n" +
            "        </Icon>\n" +
            "        <hotSpot x=\"32\" xunits=\"pixels\" y=\"64\" yunits=\"insetPixels\"/>\n" +
            "      </IconStyle>\n" +
            "      <LabelStyle>\n" +
            "        <scale>0</scale>\n" +
            "      </LabelStyle>\n" +
            "      <BalloonStyle>\n" +
            "        <text><![CDATA[<h3>$[name]</h3>]]></text>\n" +
            "      </BalloonStyle>\n" +
            "    </Style>\n" +
            "    <Style id=\"icon-1899-0288D1-nodesc-highlight\">\n" +
            "      <IconStyle>\n" +
            "        <color>ffd18802</color>\n" +
            "        <scale>1</scale>\n" +
            "        <Icon>\n" +
            "          <href>https://www.gstatic.com/mapspro/images/stock/503-wht-blank_maps.png</href>\n" +
            "        </Icon>\n" +
            "        <hotSpot x=\"32\" xunits=\"pixels\" y=\"64\" yunits=\"insetPixels\"/>\n" +
            "      </IconStyle>\n" +
            "      <LabelStyle>\n" +
            "        <scale>1</scale>\n" +
            "      </LabelStyle>\n" +
            "      <BalloonStyle>\n" +
            "        <text><![CDATA[<h3>$[name]</h3>]]></text>\n" +
            "      </BalloonStyle>\n" +
            "    </Style>\n" +
            "    <StyleMap id=\"icon-1899-0288D1-nodesc\">\n" +
            "      <Pair>\n" +
            "        <key>normal</key>\n" +
            "        <styleUrl>#icon-1899-0288D1-nodesc-normal</styleUrl>\n" +
            "      </Pair>\n" +
            "      <Pair>\n" +
            "        <key>highlight</key>\n" +
            "        <styleUrl>#icon-1899-0288D1-nodesc-highlight</styleUrl>\n" +
            "      </Pair>\n" +
            "    </StyleMap>\n" +
            "    <Folder>\n" +
            "      <name>n/a</name>\n" +
            "      <Placemark>\n" +
            "        <name>Point</name>\n" +
            "        <styleUrl>#icon-1899-0288D1-nodesc</styleUrl>\n" +
            "        <Point>\n" +
            "          <coordinates>\n" +
            "            -74.2083056,4.7174674,0\n" +
            "          </coordinates>\n" +
            "        </Point>\n" +
            "      </Placemark>\n" +
            "    </Folder>\n" +
            "  </Document>\n" +
            "</kml>" ;
}
