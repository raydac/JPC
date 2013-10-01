package org.jpc.emulator.motherboard;


import java.util.*;

public class BochsPIT
{
    public static Map<Integer, long[]> timings = new HashMap();
    static {
        //timings.put(1193181, new long[] {70220, 70222, 135756, 135757, 201293, 201293, 266828, 266829, 332365, 332365, 397900, 397901, 463436, 463437, 528972, 528973, 594508, 594509, 660044, 660046, 725580, 725581, 791116, 791118, 856652, 856653, 922189, 922189, 987724, 987725, 1053260, 1053261, 1118796, 1118797, 1184332, 1184333, 1249868, 1249870, 1315404, 1315405, 1380940, 1380942, 1446476, 1446477, 1512013, 1512013, 1577548, 1577549, 1643084, 1643085, 1708620, 1708621, 1774156, 1774157, 1839692, 1839693, 1905228, 1905229, 1970765, 1970767, 2036300, 2036302, 2101837, 2101838, 2167372, 2167374, 2232909, 2232910, 2298444, 2298446, 2363980, 2363982, 2429516, 2429518, 2495052, 2495054, 2560588, 2560591, 2626124, 2626126, 2691661, 2691662, 2757196, 2757198, 2822733, 2822734, 2888268, 2888270, 2953804, 2953806, 3019340, 0x2e124e, 0x2f124d, 0x2f124e, 0x30124d, 0x30124f, 0x31124d, 0x31124e, 0x32124d, 0x32124f, 0x33124d, 0x33124e, 0x34124e, 0x34124e, 0x35124d, 0x35124e, 0x36124d, 0x36124e, 0x37124d, 0x37124e, 0x38124d, 0x38124e, 0x39124d, 0x39124f, 0x3a124d, 0x3a124e, 0x3b124d, 0x3b124f, 0x3c124d, 0x3c124e, 0x3d124e, 0x3d124e, 0x3e124d, 0x3e124e, 0x3f124d, 0x3f124e, 0x40124d, 0x40124e, 0x41124d, 0x41124e, 0x42124d, 0x42124f, 0x43124d, 0x43124e, 0x44124d, 0x44124f, 0x45124d, 0x45124e, 0x46124e, 0x46124e, 0x47124d, 0x47124e, 0x48124e, 0x48124e, 0x49124d, 0x49124e, 0x4a124d, 0x4a124e, 0x4b124d, 0x4b124e, 0x4c124d, 0x4c124e, 0x4d124d, 0x4d124f, 0x4e124d, 0x4e124e, 0x4f124e, 0x4f124e, 0x50124d, 0x50124e, 0x51124e, 0x51124e, 0x52124d, 0x52124e, 0x53124d, 0x53124e, 0x54124d, 0x54124e, 0x55124d, 0x55124e, 0x56124d, 0x56124f, 0x57124d, 0x57124e, 0x58124e, 0x58124e, 0x59124d, 0x59124e, 0x5a124e, 0x5a124e, 0x5b124d, 0x5b124e, 0x5c124d, 0x5c124e, 0x5d124d, 0x5d124e, 0x5e124d, 0x5e124e, 0x5f124d, 0x5f124f, 0x60124d, 0x60124e, 0x61124d, 0x61124f, 0x62124d, 0x62124e, 0x63124e, 0x63124e, 0x64124d, 0x64124e, 0x65124d, 0x65124e, 0x66124d, 0x66124e, 0x67124d, 0x67124e, 0x68124d, 0x68124f, 0x69124d, 0x69124e, 0x6a124d, 0x6a124f, 0x6b124d, 0x6b124e, 0x6c124e, 0x6c124e, 0x6d124d, 0x6d124e, 0x6e124d, 0x6e124e, 0x6f124d, 0x6f124e, 0x70124d, 0x70124e, 0x71124d, 0x71124e, 0x72124d, 0x72124e, 0x73124d, 0x73124f, 0x74124d, 0x74124e, 0x75124e, 0x75124e, 0x76124d, 0x76124e, 0x77124e, 0x77124e, 0x78124d, 0x78124e, 0x79124d, 0x79124e, 0x7a124d, 0x7a124e, 0x7b124d, 0x7b124e, 0x7c124d, 0x7c124f, 0x7d124d, 0x7d124e, 0x7e124e, 0x7e124e, 0x7f124d, 0x7f124e, 0x80124e, 0x80124e, 0x81124d, 0x81124e, 0x82124d, 0x82124e, 0x83124d, 0x83124e, 0x84124d, 0x84124e, 0x85124d, 0x85124f, 0x86124d, 0x86124e, 0x87124d, 0x87124f, 0x88124d, 0x88124e, 0x89124e, 0x89124e, 0x8a124d, 0x8a124e, 0x8b124d, 0x8b124e, 0x8c124d, 0x8c124e, 0x8d124d, 0x8d124e, 0x8e124d, 0x8e124f, 0x8f124d, 0x8f124e, 0x90124d, 0x90124f, 0x91124d, 0x91124e, 0x92124e, 0x92124e, 0x93124d, 0x93124e, 0x94124d, 0x94124e, 0x95124d, 0x95124e, 0x96124d, 0x96124e, 0x97124d, 0x97124e, 0x98124d, 0x98124e, 0x99124d, 0x99124f, 0x9a124d, 0x9a124e, 0x9b124e, 0x9b124e, 0x9c124d, 0x9c124e, 0x9d124e, 0x9d124e, 0x9e124d, 0x9e124e, 0x9f124d, 0x9f124e, 0xa0124d, 0xa0124e, 0xa1124d, 0xa1124e, 0xa2124d, 0xa2124f, 0xa3124d, 0xa3124e, 0xa4124e, 0xa4124e, 0xa5124d, 0xa5124e, 0xa6124e, 0xa6124e, 0xa7124d, 0xa7124e, 0xa8124d, 0xa8124e, 0xa9124d, 0xa9124e, 0xaa124d, 0xaa124e, 0xab124d, 0xab124f, 0xac124d, 0xac124e, 0xad124d, 0xad124f, 0xae124d, 0xae124e, 0xaf124e, 0xaf124e, 0xb0124d, 0xb0124e, 0xb1124d, 0xb1124e, 0xb2124d, 0xb2124e, 0xb3124d, 0xb3124e, 0xb4124d, 0xb4124f, 0xb5124d, 0xb5124e, 0xb6124d, 0xb6124f, 0xb7124d, 0xb7124e, 0xb8124e, 0xb8124e, 0xb9124d, 0xb9124e, 0xba124d, 0xba124e, 0xbb124d, 0xbb124e, 0xbc124d, 0xbc124e, 0xbd124d, 0xbd124f, 0xbe124d, 0xbe124e, 0xbf124d, 0xbf124f, 0xc0124d, 0xc0124e, 0xc1124e, 0xc1124e, 0xc2124d, 0xc2124e, 0xc3124e, 0xc3124e, 0xc4124d, 0xc4124e, 0xc5124d, 0xc5124e, 0xc6124d, 0xc6124e, 0xc7124d, 0xc7124e, 0xc8124d, 0xc8124f, 0xc9124d, 0xc9124e, 0xca124e, 0xca124e, 0xcb124d, /*hack*/0xcc8cbc, 0xcd124d, 0xcd124e, 0xce124d, 0xce124e, 0xcf124d, 0xcf124e, 0xd0124d, 0xd0124e, 0xd1124d, 0xd1124f, 0xd2124d, 0xd2124e, 0xd3124e, 0xd3124e, 0xd4124d, 0xd4124e, 0xd5124e, 0xd5124e, 0xd6124d, 0xd6124e, 0xd7124d, 0xd7124e, 0xd8124d, 0xd8124e, 0xd9124d, 0xd9124e, 0xda124d, 0xda124f, 0xdb124d, 0xdb124e, 0xdc124d, 0xdc124f, 0xdd124d, 0xdd124e, 0xde124e, 0xde124e, 0xdf124d, 0xdf124e, 0xe0124d, 0xe0124e, 0xe1124d, 0xe1124e, 0xe2124d, 0xe2124e, 0xe3124d, 0xe3124f, 0xe4124d, 0xe4124e, 0xe5124d, 0xe5124f, 0xe6124d, 0xe6124e, 0xe7124e, 0xe7124e, 0xe8124d, 0xe8124e, 0xe9124d, 0xe9124e, 0xea124d, 0xea124e, 0xeb124d, 0xeb124e, 0xec124d, 0xec124e, 0xed124d, 0xed124e, 0xee124d, 0xee124f, 0xef124d, 0xef124e, 0xf0124e, 0xf0124e, 0xf1124d, 0xf1124e, 0xf2124e, 0xf2124e, 0xf3124d, 0xf3124e, 0xf4124d, /*hack 2*/0xf5125d, 0xf9124e, 0xf91294, 0xfd124d, 0xfd125f, 0x110124d, 0x110124e, 0x1141299, 0x114129c, 0x118124e, 0x1181267, 0x11c124d, 0x11c1254, 0xF11a124dL, 0xF11a124eL, 0x11b124d, 0x11b124e, 0x11c124d, 0x11c124e, 0x11d124d, 0x11d124f, 0x11e124d, 0x11e124e, 0x11f124e, 0x11f124e, 0x120124d, 0x120124e, 0x121124e, 0x121124e, 0x122124d, 0x122124e, 0x123124d, 0x123124e, 0x124124d, 0x124124e, 0x125124d, 0x125124e, 0x126124d, 0x126124f, 0x127124d, 0x127124e, 0x128124d, 0x128124f, 0x129124d, 0x129124e, 0x12a124e, 0x12a124e, 0x12b124d, 0x12b124e, 0x12c124d, 0x12c124e, 0x12d124d, 0x12d124e, 0x12e124d, 0x12e124e, 0x12f124d, 0x12f124f, 0x130124d, 0x130124e, 0x131124d, 0x131124f, 0x132124d, 0x132124e, 0x133124e, 0x133124e, 0x134124d, 0x134124e, 0x135124d, 0x135124e, 0x136124d, 0x136124e, 0x137124d, 0x137124e, 0x138124d, 0x138124e, 0x139124d, 0x139124e, 0x13a124d, 0x13a124f, 0x13b124d, 0x13b124e, 0x13c124e, 0x13c124e, 0x13d124d, 0x13d124e, 0x13e124e, 0x13e124e, 0x13f124d, 0x13f124e, 0x140124d, 0x140124e, 0x141124d, 0x141124e, 0x142124d, 0x142124e, 0x143124d, 0x143124f, 0x144124d, 0x144124e, 0x145124e, 0x145124e, 0x146124d, 0x146124e, 0x147124e, 0x147124e, 0x148124d, 0x148124e, 0x149124d, 0x149124e, 0x14a124d, 0x14a124e, 0x14b124d, 0x14b124e, 0x14c124d, 0x14c124f, 0x14d124d, 0x14d124e, 0x14e124d, 0x14e124f, 0x14f124d, 0x14f124e, 0x150124e, 0x150124e, 0x151124d, 0x151124e, 0x152124d, 0x152124e, 0x153124d, 0x153124e, 0x154124d, 0x154124e, 0x155124d, 0x155124f, 0x156124d, 0x156124e, 0x157124d, 0x157124f, 0x158124d, 0x158124e, 0x159124e, 0x159124e, 0x15a124d, 0x15a124e, 0x15b124d, 0x15b124e, 0x15c124d, 0x15c124e, 0x15d124d, 0x15d124e, 0x15e124d, 0x15e124f, 0x15f124d, 0x15f124e, 0x160124d, 0x160124f, 0x161124d, 0x161124e, 0x162124e, 0x162124e, 0x163124d, 0x163124e, 0x164124e, 0x164124e, 0x165124d, 0x165124e, 0x166124d, 0x166124e, 0x167124d, 0x167124e, 0x168124d, 0x168124e, 0x169124d, 0x169124f, 0x16a124d, 0x16a124e, 0x16b124e, 0x16b124e, 0x16c124d, 0x16c124e, 0x16d124e, 0x16d124e, 0x16e124d, 0x16e124e, 0x16f124d, 0x16f124e, 0x170124d, 0x170124e, 0x171124d, 0x171124e, 0x172124d, 0x172124f, 0x173124d, 0x173124e, 0x174124e, 0x174124e, 0x175124d, 0x175124e, 0x176124e, 0x176124e, 0x177124d, 0x177124e, 0x178124d, 0x178124e, 0x179124d, 0x179124e, 0x17a124d, 0x17a124e, 0x17b124d, 0x17b124f, 0x17c124d, 0x17c124e, 0x17d124d, 0x17d124f, 0x17e124d, 0x17e124e, 0x17f124e, 0x17f124e, 0x180124d, 0x180124e, 0x181124d, 0x181124e, 0x182124d, 0x182124e, 0x183124d, 0x183124e, 0x184124d, 0x184124f, 0x185124d, 0x185124e, 0x186124d, 0x186124f, 0x187124d, 0x187124e, 0x188124e, 0x188124e, 0x189124d, 0x189124e, 0x18a124d, 0x18a124e, 0x18b124d, 0x18b124e, 0x18c124d, 0x18c124e, 0x18d124d, 0x18d124e, 0x18e124d, 0x18e124e, 0x18f124d, 0x18f124f, 0x190124d, 0x190124e, 0x191124e, 0x191124e, 0x192124d, 0x192124e, 0x193124e, 0x193124e, 0x194124d, 0x194124e, 0x195124d, 0x195124e, 0x196124d, 0x196124e, 0x197124d, 0x197124e, 0x198124d, 0x198124f, 0x199124d, 0x199124e, 0x19a124e, 0x19a124e, 0x19b124d, 0x19b124e, 0x19c124e, 0x19c124e, 0x19d124d, 0x19d124e, 0x19e124d, 0x19e124e, 0x19f124d, 0x19f124e, 0x1a0124d, 0x1a0124e, 0x1a1124d, 0x1a1124f, 0x1a2124d, 0x1a2124e, 0x1a3124d, 0x1a3124f, 0x1a4124d, 0x1a4124e, 0x1a5124e, 0x1a5124e, 0x1a6124d, 0x1a6124e, 0x1a7124d, 0x1a7124e, 0x1a8124d, 0x1a8124e, 0x1a9124d, 0x1a9124e, 0x1aa124d, 0x1aa124f, 0x1ab124d, 0x1ab124e, 0x1ac124d, 0x1ac124f, 0x1ad124d, 0x1ad124e, 0x1ae124e, 0x1ae124e, 0x1af124d, 0x1af124e, 0x1b0124d, 0x1b0124e, 0x1b1124d, 0x1b1124e, 0x1b2124d, 0x1b2124e, 0x1b3124d, 0x1b3124e, 0x1b4124d, 0x1b4124e, 0x1b5124d, 0x1b5124f, 0x1b6124d, 0x1b6124e, 0x1b7124e, 0x1b7124e, 0x1b8124d, 0x1b8124e, 0x1b9124e, 0x1b9124e, 0x1ba124d, 0x1ba124e, 0x1bb124d, 0x1bb124e, 0x1bc124d, 0x1bc124e, 0x1bd124d, 0x1bd124e, 0x1be124d, 0x1be124f, 0x1bf124d, 0x1bf124e, 0x1c0124e, 0x1c0124e, 0x1c1124d, 0x1c1124e, 0x1c2124e, 0x1c2124e, 0x1c3124d, 0x1c3124e, 0x1c4124d, 0x1c4124e, 0x1c5124d, 0x1c5124e, 0x1c6124d, 0x1c6124e, 0x1c7124d, 0x1c7124f, 0x1c8124d, 0x1c8124e, 0x1c9124d, 0x1c9124f, 0x1ca124d, 0x1ca124e, 0x1cb124e, 0x1cb124e, 0x1cc124d, 0x1cc124e, 0x1cd124d, 0x1cd124e, 0x1ce124d, 0x1ce124e, 0x1cf124d, 0x1cf124e, 0x1d0124d, 0x1d0124f, 0x1d1124d, 0x1d1124e, 0x1d2124d, 0x1d2124f, 0x1d3124d, 0x1d3124e, 0x1d4124e, 0x1d4124e, 0x1d5124d, 0x1d5124e, 0x1d6124d, 0x1d6124e, 0x1d7124d, 0x1d7124e, 0x1d8124d, 0x1d8124e, 0x1d9124d, 0x1d9124f, 0x1da124d, 0x1da124e, 0x1db124d, 0x1db124f, 0x1dc124d, 0x1dc124e, 0x1dd124e, 0x1dd124e, 0x1de124d, 0x1de124e, 0x1df124e, 0x1df124e, 0x1e0124d, 0x1e0124e, 0x1e1124d, 0x1e1124e, 0x1e2124d, 0x1e2124e, 0x1e3124d, 0x1e3124e, 0x1e4124d, 0x1e4124f, 0x1e5124d, 0x1e5124e, 0x1e6124e, 0x1e6124e, 0x1e7124d, 0x1e7124e, 0x1e8124e, 0x1e8124e, 0x1e9124d, 0x1e9124e, 0x1ea124d, 0x1ea124e, 0x1eb124d, 0x1eb124e, 0x1ec124d, 0x1ec124e, 0x1ed124d, 0x1ed124f, 0x1ee124d, 0x1ee124e, 0x1ef124e, 0x1ef124e, 0x1f0124d, 0x1f0124e, 0x1f1124e, 0x1f1124e, 0x1f2124d, 0x1f2124e, 0x1f3124d, 0x1f3124e, 0x1f4124d, 0x1f4124e, 0x1f5124d, 0x1f5124e, 0x1f6124d, 0x1f6124f, 0x1f7124d, 0x1f7124e, 0x1f8124d, 0x1f8124f, 0x1f9124d, 0x1f9124e, 0x1fa124e, 0x1fa124e, 0x1fb124d, 0x1fb124e, 0x1fc124d, 0x1fc124e, 0x1fd124d, 0x1fd124e, 0x1fe124d, 0x1fe124e, 0x1ff124d, 0x1ff124f, 0x200124d, 0x200124e, 0x201124d, 0x201124f, 0x202124d, 0x202124e, 0x203124e, 0x203124e, 0x204124d, 0x204124e, 0x205124d, 0x205124e, 0x206124d, 0x206124e, 0x207124d, 0x207124e, 0x208124d, 0x208124e, 0x209124d, 0x209124e, 0x20a124d, 0x20a124f, 0x20b124d, 0x20b124e, 0x20c124e, 0x20c124e, 0x20d124d, 0x20d124e, 0x20e124e, 0x20e124e, 0x20f124d, 0x20f124e, 0x210124d, 0x210124e, 0x211124d, 0x211124e, 0x212124d, 0x212124e, 0x213124d, 0x213124f, 0x214124d, 0x214124e, 0x215124e, 0x215124e, 0x216124d, 0x216124e, 0x217124e, 0x217124e, 0x218124d, 0x218124e, 0x219124d, 0x219124e, 0x21a124d, 0x21a124e, 0x21b124d, 0x21b124e, 0x21c124d, 0x21c124f, 0x21d124d, 0x21d124e, 0x21e124d, 0x21e124f, 0x21f124d, 0x21f124e, 0x220124e, 0x220124e, 0x221124d, 0x221124e, 0x222124d, 0x222124e, 0x223124d, 0x223124e, 0x224124d, 0x224124e, 0x225124d, 0x225124f, 0x226124d, 0x226124e, 0x227124d, 0x227124f, 0x228124d, 0x228124e, 0x229124e, 0x229124e, 0x22a124d, 0x22a124e, 0x22b124d, 0x22b124e, 0x22c124d, 0x22c124e, 0x22d124d, 0x22d124e, 0x22e124d, 0x22e124e, 0x22f124d, 0x22f124e, 0x230124d, 0x230124f, 0x231124d, 0x231124e, 0x232124e, 0x232124e, 0x233124d, 0x233124e, 0x234124e, 0x234124e, 0x235124d, 0x235124e, 0x236124d, 0x236124e, 0x237124d, 0x237124e, 0x238124d, 0x238124e, 0x239124d, 0x239124f, 0x23a124d, 0x23a124e, 0x23b124e, 0x23b124e, 0x23c124d, 0x23c124e, 0x23d124e, 0x23d124e, 0x23e124d, 0x23e124e, 0x23f124d, 0x23f124e, 0x240124d, 0x240124e, 0x241124d, 0x241124e, 0x242124d, 0x242124f, 0x243124d, 0x243124e, 0x244124d, 0x244124f, 0x245124d, 0x245124e, 0x246124e, 0x246124e, 0x247124d, 0x247124e, 0x248124d, 0x248124e, 0x249124d, 0x249124e, 0x24a124d, 0x24a124e, 0x24b124d, 0x24b124f, 0x24c124d, 0x24c124e, 0x24d124d, 0x24d124f, 0x24e124d, 0x24e124e, 0x24f124e, 0x24f124e, 0x250124d, 0x250124e, 0x251124d, 0x251124e, 0x252124d, 0x252124e, 0x253124d, 0x253124e, 0x254124d, 0x254124e, 0x255124d, 0x255124e, 0x256124d, 0x256124f, 0x257124d, 0x257124e, 0x258124e, 0x258124e, 0x259124d, 0x259124e, 0x25a124e, 0x25a124e, 0x25b124d, 0x25b124e, 0x25c124d, 0x25c124e, 0x25d124d, 0x25d124e, 0x25e124d, 0x25e124e, 0x25f124d, 0x25f124f, 0x260124d, 0x260124e, 0x261124e, 0x261124e, 0x262124d, 0x262124e, 0x263124e, 0x263124e, 0x264124d, 0x264124e, 0x265124d, 0x265124e, 0x266124d, 0x266124e, 0x267124d, 0x267124e, 0x268124d, 0x268124f, 0x269124d, 0x269124e, 0x26a124d, 0x26a124f, 0x26b124d, 0x26b124e, 0x26c124e, 0x26c124e, 0x26d124d, 0x26d124e, 0x26e124d, 0x26e124e, 0x26f124d, 0x26f124e, 0x270124d, 0x270124e, 0x271124d, 0x271124f, 0x272124d, 0x272124e, 0x273124d, 0x273124f, 0x274124d, 0x274124e, 0x275124e, 0x275124e, 0x276124d, 0x276124e, 0x277124d, 0x277124e, 0x278124d, 0x278124e, 0x279124d, 0x279124e, 0x27a124d, 0x27a124f, 0x27b124d, 0x27b124e, 0x27c124d, 0x27c124f, 0x27d124d, 0x27d124e, 0x27e124e, 0x27e124e, 0x27f124d, 0x27f124e, 0x280124e, 0x280124e, 0x281124d, 0x281124e, 0x282124d, 0x282124e, 0x283124d, 0x283124e, 0x284124d, 0x284124e, 0x285124d, 0x285124f, 0x286124d, 0x286124e, 0x287124e, 0x287124e, 0x288124d, 0x288124e, 0x289124e, 0x289124e, 0x28a124d, 0x28a124e, 0x28b124d, 0x28b124e, 0x28c124d, 0x28c124e, 0x28d124d, 0x28d124e, 0x28e124d, 0x28e124f, 0x28f124d, 0x28f124e, 0x290124e, 0x290124e, 0x291124d, 0x291124e, 0x292124e, 0x292124e, 0x293124d, 0x293124e, 0x294124d, 0x294124e, 0x295124d, 0x295124e, 0x296124d, 0x296124e, 0x297124d, 0x297124f, 0x298124d, 0x298124e, 0x299124d, 0x299124f, 0x29a124d, 0x29a124e, 0x29b124e, 0x29b124e, 0x29c124d, 0x29c124e, 0x29d124d, 0x29d124e, 0x29e124d, 0x29e124e, 0x29f124d, 0x29f124e, 0x2a0124d, 0x2a0124f, 0x2a1124d, 0x2a1124e, 0x2a2124d, 0x2a2124f, 0x2a3124d, 0x2a3124e, 0x2a4124e, 0x2a4124e, 0x2a5124d, 0x2a5124e, 0x2a6124d, 0x2a6124e, 0x2a7124d, 0x2a7124e, 0x2a8124d, 0x2a8124e, 0x2a9124d, 0x2a9124e, 0x2aa124d, 0x2aa124e, 0x2ab124d, 0x2ab124f, 0x2ac124d, 0x2ac124e, 0x2ad124e, 0x2ad124e, 0x2ae124d, 0x2ae124e, 0x2af124e, 0x2af124e, 0x2b0124d, 0x2b0124e, 0x2b1124d, 0x2b1124e, 0x2b2124d, 0x2b2124e, 0x2b3124d, 0x2b3124e, 0x2b4124d, 0x2b4124f, 0x2b5124d, 0x2b5124e, 0x2b6124e, 0x2b6124e, 0x2b7124d, 0x2b7124e, 0x2b8124e, 0x2b8124e, 0x2b9124d, 0x2b9124e, 0x2ba124d, 0x2ba124e, 0x2bb124d, 0x2bb124e, 0x2bc124d, 0x2bc124e, 0x2bd124d, 0x2bd124f, 0x2be124d, 0x2be124e, 0x2bf124d, 0x2bf124f, 0x2c0124d, 0x2c0124e, 0x2c1124e, 0x2c1124e, 0x2c2124d, 0x2c2124e, 0x2c3124d, 0x2c3124e, 0x2c4124d, 0x2c4124e, 0x2c5124d, 0x2c5124e, 0x2c6124d, 0x2c6124f, 0x2c7124d, 0x2c7124e, 0x2c8124d, 0x2c8124f, 0x2c9124d, 0x2c9124e, 0x2ca124e, 0x2ca124e, 0x2cb124d, 0x2cb124e, 0x2cc124d, 0x2cc124e, 0x2cd124d, 0x2cd124e, 0x2ce124d, 0x2ce124e, 0x2cf124d, 0x2cf124e, 0x2d0124d, 0x2d0124e, 0x2d1124d, 0x2d1124f, 0x2d2124d, 0x2d2124e, 0x2d3124e, 0x2d3124e, 0x2d4124d, 0x2d4124e, 0x2d5124e, 0x2d5124e, 0x2d6124d, 0x2d6124e, 0x2d7124d, 0x2d7124e, 0x2d8124d, 0x2d8124e, 0x2d9124d, 0x2d9124e, 0x2da124d, 0x2da124f, 0x2db124d, 0x2db124e, 0x2dc124e, 0x2dc124e, 0x2dd124d, 0x2dd124e, 0x2de124e, 0x2de124e, 0x2df124d, 0x2df124e, 0x2e0124d, 0x2e0124e, 0x2e1124d, 0x2e1124e, 0x2e2124d, 0x2e2124e, 0x2e3124d, 0x2e3124f, 0x2e4124d, 0x2e4124e, 0x2e5124d, 0x2e5124f, 0x2e6124d, 0x2e6124e, 0x2e7124e, 0x2e7124e, 0x2e8124d, 0x2e8124e, 0x2e9124d, 0x2e9124e, 0x2ea124d, 0x2ea124e, 0x2eb124d, 0x2eb124e, 0x2ec124d, 0x2ec124f, 0x2ed124d, 0x2ed124e, 0x2ee124d, 0x2ee124f, 0x2ef124d, 0x2ef124e, 0x2f0124e, 0x2f0124e, 0x2f1124d, 0x2f1124e, 0x2f2124d, 0x2f2124e, 0x2f3124d, 0x2f3124e, 0x2f4124d, 0x2f4124e, 0x2f5124d, 0x2f5124f, 0x2f6124d, 0x2f6124e, 0x2f7124d, 0x2f7124f, 0x2f8124d, 0x2f8124e, 0x2f9124e, 0x2f9124e, 0x2fa124d, 0x2fa124e, 0x2fb124e, 0x2fb124e, 0x2fc124d, 0x2fc124e, 0x2fd124d, 0x2fd124e, 0x2fe124d, 0x2fe124e, 0x2ff124d, 0x2ff124e, 0x300124d, 0x300124f, 0x301124d, 0x301124e, 0x302124e, 0x302124e, 0x303124d, 0x303124e, 0x304124e, 0x304124e, 0x305124d, 0x305124e, 0x306124d, 0x306124e, 0x307124d, 0x307124e, 0x308124d, 0x308124e, 0x309124d, 0x309124f, 0x30a124d, 0x30a124e, 0x30be716, 0x30be717, 0x30ce2bc, 0x30ce2bd, 0x30dde62, 0x30dde63, 0x30eda08, 0x30eda0a, 0x30fd5ae, 0x30fd5af, 0x310d154, 0x310d155, 0x311ccfa, 0x311ccfb, 0x312c8a0, 0x312c8a1, 0x313c446, 0x313c448, 0x314bfed, 0x314bfed, 0x315bb92, 0x315bb93, 0x316b738, 0x316b739, 0x317b2de, 0x317b2df, 0x318ae84, 0x318ae86, 0x319aa2b, 0x319aa2b, 0x31aa5d0, 0x31aa5d1, 0x31ba176, 0x31ba177, 0x31c9d1c, 0x31c9d1d, 0x31d98c2, 0x31d98c4, 0x31e9469, 0x31e9469, 0x31f900e, 0x31f900f, 0x3208bb4, 0x3208bb5, 0x321875a, 0x321875b, 0x3228300, 0x3228301, 0x3237ea7, 0x3237ea7, 0x3247a4c, 0x3247a4d, 0x32575f2, 0x32575f3, 0x3267198, 0x3267199, 0x3276d3e, 0x3276d3f, 0x32868e4, 0x32868e6, 0x329648b, 0x329648b, 0x32a6030, 0x32a6031, 0x32b5bd6, 0x32b5bd7, 0x32c577c, 0x32c577d, 0x32d5322, 0x32d5324, 0x32e4ec9, 0x32e4ec9, 0x32f4a6e, 0x32f4a6f, 0x3304614, 0x3304615, 0x33141ba, 0x33141bb, 0x3323d60, 0x3323d62, 0x3333907, 0x3333907, 0x33434ac, 0x33434ad, 0x3353052, 0x3353053, 0x3362bf8, 0x3362bf9, 0x337279e, 0x337279f, 0x3382345, 0x3382345, 0x3391eea, 0x3391eeb, 0x33a1a90, 0x33a1a91, 0x33b1636, 0x33b1637, 0x33c11dc, 0x33c11dd, 0x33d0d82, 0x33d0d84, 0x33e0928, 0x33e0929, 0x33f04ce, 0x33f04cf, 0x3400074, 0x3400075, 0x340fc1a, 0x340fc1b, 0x341f7c0, 0x341f7c2, 0x342f367, 0x342f367, 0x343ef0c, 0x343ef0d, 0x344eab2, 0x344eab3, 0x345e658, 0x345e659, 0x346e1fe, 0x346e200, 0x347dda5, 0x347dda5, 0x348d94a, 0x348d94b, 0x349d4f0, 0x349d4f1, 0x34ad096, 0x34ad097, 0x34bcc3c, 0x34bcc3e, 0x34cc7e3, 0x34cc7e3, 0x34dc388, 0x34dc389, 0x34ebf2e, 0x34ebf2f, 0x34fbad4, 0x34fbad5, 0x350b67a, 0x350b67b, 0x351b221, 0x351b221, 0x352adc6, 0x352adc7, 0x353a96c, 0x353a96d, 0x354a512, 0x354a513, 0x355a0b8, 0x355a0b9, 0x3569c5e, 0x3569c60, 0x3579805, 0x3579805, 0x35893aa, 0x35893ab, 0x3598f50, 0x3598f51, 0x35a8af6, 0x35a8af7, 0x35b869c, 0x35b869e, 0x35c8243, 0x35c8243, 0x35d7de8, 0x35d7de9, 0x35e798e, 0x35e798f, 0x35f7534, 0x35f7535, 0x36070da, 0x36070dc, 0x3616c81, 0x3616c81, 0x3626826, 0x3626827, 0x36363cc, 0x36363cd, 0x3645f72, 0x3645f73, 0x3655b18, 0x3655b1a, 0x36656bf, 0x36656bf, 0x3675264, 0x3675265, 0x3684e0a, 0x3684e0b, 0x36949b0, 0x36949b1, 0x36a4556, 0x36a4557, 0x36b40fc, 0x36b40fe, 0x36c3ca2, 0x36c3ca3, 0x36d3848, 0x36d3849, 0x36e33ee, 0x36e33ef, 0x36f2f94, 0x36f2f95, 0x3702b3a, 0x3702b3c, 0x37126e1, 0x37126e1, 0x3722286, 0x3722287, 0x3731e2c, 0x3731e2d, 0x37419d2, 0x37419d3, 0x3751578, 0x375157a, 0x376111f, 0x376111f, 0x3770cc4, 0x3770cc5, 0x378086a, 0x378086b, 0x3790410, 0x3790411, 0x379ffb6, 0x379ffb8, 0x37afb5d, 0x37afb5d, 0x37bf702, 0x37bf703, 0x37cf2a8, 0x37cf2a9, 0x37dee4e, 0x37dee4f, 0x37ee9f4, 0x37ee9f5, 0x37fe59b, 0x37fe59b, 0x380e140, 0x380e141, 0x381dce6, 0x381dce7, 0x382d88c, 0x382d88d, 0x383d432, 0x383d433, 0x384cfd8, 0x384cfda, 0x385cb7f, 0x385cb7f, 0x386c724, 0x386c725, 0x387c2ca, 0x387c2cb, 0x388be70, 0x388be71, 0x389ba16, 0x389ba18, 0x38ab5bd, 0x38ab5bd, 0x38bb162, 0x38bb163, 0x38cad08, 0x38cad09, 0x38da8ae, 0x38da8af, 0x38ea454, 0x38ea456, 0x38f9ffb, 0x38f9ffb, 0x3909ba0, 0x3909ba1, 0x3919746, 0x3919747, 0x39292ec, 0x39292ed, 0x3938e92, 0x3938e94, 0x3948a39, 0x3948a39, 0x39585de, 0x39585df, 0x3968184, 0x3968185, 0x3977d2a, 0x3977d2b, 0x39878d0, 0x39878d1, 0x3997476, 0x3997478, 0x39a701c, 0x39a701d, 0x39b6bc2, 0x39b6bc3, 0x39c6768, 0x39c6769, 0x39d630e, 0x39d630f, 0x39e5eb4, 0x39e5eb6, 0x39f5a5b, 0x39f5a5b, 0x3a05600, 0x3a05601, 0x3a151a6, 0x3a151a7, 0x3a24d4c, 0x3a24d4d, 0x3a348f2, 0x3a348f4, 0x3a44499, 0x3a44499, 0x3a5403e, 0x3a5403f, 0x3a63be4, 0x3a63be5, 0x3a7378a, 0x3a7378b, 0x3a83330, 0x3a83332, 0x3a92ed7, 0x3a92ed7, 0x3aa2a7c, 0x3aa2a7d, 0x3ab2622, 0x3ab2623, 0x3ac21c8, 0x3ac21c9, 0x3ad1d6e, 0x3ad1d6f, 0x3ae1915, 0x3ae1915, 0x3af14ba, 0x3af14bb, 0x3b01060, 0x3b01061, 0x3b10c06, 0x3b10c07, 0x3b207ac, 0x3b207ad, 0x3b30352, 0x3b30354, 0x3b3fef8, 0x3b3fef9, 0x3b4fa9e, 0x3b4fa9f, 0x3b5f644, 0x3b5f645, 0x3b6f1ea, 0x3b6f1eb, 0x3b7ed90, 0x3b7ed92, 0x3b8e937, 0x3b8e937, 0x3b9e4dc, 0x3b9e4dd, 0x3bae082, 0x3bae083, 0x3bbdc28, 0x3bbdc29, 0x3bcd7ce, 0x3bcd7d0, 0x3bdd375, 0x3bdd375, 0x3becf1a, 0x3becf1b, 0x3bfcac0, 0x3bfcac1, 0x3c0c666, 0x3c0c667, 0x3c1c20c, 0x3c1c20e, 0x3c2bdb3, 0x3c2bdb3, 0x3c3b958, 0x3c3b959, 0x3c4b4fe, 0x3c4b4ff, 0x3c5b0a4, 0x3c5b0a5, 0x3c6ac4a, 0x3c6ac4b, 0x3c7a7f0, 0x3c7a7f2, 0x3c8a396, 0x3c8a397, 0x3c99f3c, 0x3c99f3d, 0x3ca9ae2, 0x3ca9ae3, 0x3cb9688, 0x3cb9689, 0x3cc922e, 0x3cc9230, 0x3cd8dd5, 0x3cd8dd5, 0x3ce897a, 0x3ce897b, 0x3cf8520, 0x3cf8521, 0x3d080c6, 0x3d080c7, 0x3d17c6c, 0x3d17c6e, 0x3d27813, 0x3d27813, 0x3d373b8, 0x3d373b9, 0x3d46f5e, 0x3d46f5f, 0x3d56b04, 0x3d56b05, 0x3d666aa, 0x3d666ac, 0x3d76251, 0x3d76251, 0x3d85df6, 0x3d85df7, 0x3d9599c, 0x3d9599d, 0x3da5542, 0x3da5543, 0x3db50e8, 0x3db50e9, 0x3dc4c8f, 0x3dc4c8f, 0x3dd4834, 0x3dd4835, 0x3de43da, 0x3de43db, 0x3df3f80, 0x3df3f81, 0x3e03b26, 0x3e03b27, 0x3e136cc, 0x3e136ce, 0x3e23272, 0x3e23273, 0x3e32e18, 0x3e32e19, 0x3e429be, 0x3e429bf, 0x3e52564, 0x3e52565, 0x3e6210a, 0x3e6210c, 0x3e71cb1, 0x3e71cb1, 0x3e81856, 0x3e81857, 0x3e913fc, 0x3e913fd, 0x3ea0fa2, 0x3ea0fa3, 0x3eb0b48, 0x3eb0b4a, 0x3ec06ef, 0x3ec06ef, 0x3ed0294, 0x3ed0295, 0x3edfe3a, 0x3edfe3b, 0x3eef9e0, 0x3eef9e1, 0x3eff586, 0x3eff588, 0x3f0f12d, 0x3f0f12d, 0x3f1ecd2, 0x3f1ecd3, 0x3f2e878, 0x3f2e879, 0x3f3e41e, 0x3f3e41f, 0x3f4dfc4, 0x3f4dfc5, 0x3f5db6a, 0x3f5db6c, 0x3f6d710, 0x3f6d711, 0x3f7d2b6, 0x3f7d2b7, 0x3f8ce5c, 0x3f8ce5d, 0x3f9ca02, 0x3f9ca03, 0x3fac5a8, 0x3fac5aa, 0x3fbc14f, 0x3fbc14f, 0x3fcbcf4, 0x3fcbcf5, 0x3fdb89a, 0x3fdb89b, 0x3feb440, 0x3feb441, 0x3ffafe6, 0x3ffafe8, 0x400ab8d, 0x400ab8d, 0x401a732, 0x401a733, 0x402a2d8, 0x402a2d9, 0x4039e7e, 0x4039e7f, 0x4049a24, 0x4049a26, 0x40595cb, 0x40595cb, 0x4069170, 0x4069171, 0x4078d16, 0x4078d17, 0x40888bc, 0x40888bd, 0x4098462, 0x4098463, 0x40a8009, 0x40a8009, 0x40b7bae, 0x40b7baf, 0x40c7754, 0x40c7755, 0x40d72fa, 0x40d72fb, 0x40e6ea0, 0x40e6ea1, 0x40f6a46, 0x40f6a48, 0x41065ec, 0x41065ed, 0x4116192, 0x4116193, 0x4125d38, 0x4125d39, 0x41358de, 0x41358df, 0x4145484, 0x4145486, 0x415502b, 0x415502b, 0x4164bd0, 0x4164bd1, 0x4174776, 0x4174777, 0x418431c, 0x418431d, 0x4193ec2, 0x4193ec4, 0x41a3a69, 0x41a3a69, 0x41b360e, 0x41b360f, 0x41c31b4, 0x41c31b5, 0x41d2d5a, 0x41d2d5b, 0x41e2900, 0x41e2902, 0x41f24a7, 0x41f24a7, 0x420204c, 0x420204d, 0x4211bf2, 0x4211bf3, 0x4221798, 0x4221799, 0x423133e, 0x423133f, 0x4240ee4, 0x4240ee6, 0x4250a8a, 0x4250a8b, 0x4260630, 0x4260631, 0x42701d6, 0x42701d7, 0x427fd7c, 0x427fd7d, 0x428f922, 0x428f924, 0x429f4c9, 0x429f4c9, 0x42af06e, 0x42af06f, 0x42bec14, 0x42bec15, 0x42ce7ba, 0x42ce7bb, 0x42de360, 0x42de362, 0x42edf07, 0x42edf07, 0x42fdaac, 0x42fdaad, 0x430d652, 0x430d653, 0x431d1f8, 0x431d1f9, 0x432cd9e, 0x432cda0, 0x433c945, 0x433c945, 0x434c4ea, 0x434c4eb, 0x435c090, 0x435c091, 0x436bc36, 0x436bc37, 0x437b7dc, 0x437b7dd, 0x438b383, 0x438b383, 0x439af28, 0x439af29, 0x43aaace, 0x43aaacf, 0x43ba674, 0x43ba675, 0x43ca21a, 0x43ca21b, 0x43d9dc0, 0x43d9dc2, 0x43e9966, 0x43e9967, 0x43f950c, 0x43f950d, 0x44090b2, 0x44090b3, 0x4418c58, 0x4418c59, 0x44287fe, 0x4428800, 0x44383a5, 0x44383a5, 0x4447f4a, 0x4447f4b, 0x4457af0, 0x4457af1, 0x4467696, 0x4467697, 0x447723c, 0x447723e, 0x4486de3, 0x4486de3, 0x4496988, 0x4496989, 0x44a652e, 0x44a652f, 0x44b60d4, 0x44b60d5, 0x44c5c7a, 0x44c5c7c, 0x44d5821, 0x44d5821, 0x44e53c6, 0x44e53c7, 0x44f4f6c, 0x44f4f6d, 0x4504b12, 0x4504b13, 0x45146b8, 0x45146b9, 0x452425f, 0x452425f, 0x4533e04, 0x4533e05, 0x45439aa, 0x45439ab, 0x4553550, 0x4553551, 0x45630f6, 0x45630f7, 0x4572c9c, 0x4572c9e, 0x4582843, 0x4582843, 0x45923e8, 0x45923e9, 0x45a1f8e, 0x45a1f8f, 0x45b1b34, 0x45b1b35, 0x45c16da, 0x45c16dc, 0x45d1281, 0x45d1281, 0x45e0e26, 0x45e0e27, 0x45f09cc, 0x45f09cd, 0x4600572, 0x4600573, 0x4610118, 0x461011a, 0x461fcbf, 0x461fcbf, 0x462f864, 0x462f865, 0x463f40a, 0x463f40b, 0x464efb0, 0x464efb1, 0x465eb56, 0x465eb57, 0x466e6fd, 0x466e6fd, 0x467e2a2, 0x467e2a3, 0x468de48, 0x468de49, 0x469d9ee, 0x469d9ef, 0x46ad594, 0x46ad595, 0x46bd13a, 0x46bd13c, 0x46ccce0, 0x46ccce1, 0x46dc886, 0x46dc887, 0x46ec42c, 0x46ec42d, 0x46fbfd2, 0x46fbfd3, 0x470bb78, 0x470bb7a, 0x471b71f, 0x471b71f, 0x472b2c4, 0x472b2c5, 0x473ae6a, 0x473ae6b, 0x474aa10, 0x474aa11, 0x475a5b6, 0x475a5b8, 0x476a15d, 0x476a15d, 0x4779d02, 0x4779d03, 0x47898a8, 0x47898a9, 0x479944e, 0x479944f, 0x47a8ff4, 0x47a8ff6, 0x47b8b9b, 0x47b8b9b, 0x47c8740, 0x47c8741, 0x47d82e6, 0x47d82e7, 0x47e7e8c, 0x47e7e8d, 0x47f7a32, 0x47f7a33, 0x48075d9, 0x48075d9, 0x481717e, 0x481717f, 0x4826d24, 0x4826d25, 0x48368ca, 0x48368cb, 0x4846470, 0x4846471, 0x4856016, 0x4856018, 0x4865bbd, 0x4865bbd, 0x4875762, 0x4875763, 0x4885308, 0x4885309, 0x4894eae, 0x4894eaf, 0x48a4a54, 0x48a4a56, 0x48b45fb, 0x48b45fb, 0x48c41a0, 0x48c41a1, 0x48d3d46, 0x48d3d47, 0x48e38ec, 0x48e38ed, 0x48f3492, 0x48f3494, 0x4903039, 0x4903039, 0x4912bde, 0x4912bdf, 0x4922784, 0x4922785, 0x493232a, 0x493232b, 0x4941ed0, 0x4941ed1, 0x4951a77, 0x4951a77, 0x496161c, 0x496161d, 0x49711c2, 0x49711c3, 0x4980d68, 0x4980d69, 0x499090e, 0x499090f, 0x49a04b4, 0x49a04b6, 0x49b005a, 0x49b005b, 0x49bfc00, 0x49bfc01, 0x49cf7a6, 0x49cf7a7, 0x49df34c, 0x49df34d, 0x49eeef2, 0x49eeef4, 0x49fea99, 0x49fea99, 0x4a0e63e, 0x4a0e63f, 0x4a1e1e4, 0x4a1e1e5, 0x4a2dd8a, 0x4a2dd8b, 0x4a3d930, 0x4a3d932, 0x4a4d4d7, 0x4a4d4d7, 0x4a5d07c, 0x4a5d07d, 0x4a6cc22, 0x4a6cc23, 0x4a7c7c8, 0x4a7c7c9, 0x4a8c36e, 0x4a8c370, 0x4a9bf15, 0x4a9bf15, 0x4aababa, 0x4aababb, 0x4abb660, 0x4abb661, 0x4acb206, 0x4acb207, 0x4adadac, 0x4adadad, 0x4aea953, 0x4aea953, 0x4afa4f8, 0x4afa4f9, 0x4b0a09e, 0x4b0a09f, 0x4b19c44, 0x4b19c45, 0x4b297ea, 0x4b297eb});
    }
    private final long[] cycles;
    private int index=0;

    public BochsPIT(int ips)
    {
        if (!timings.containsKey(ips))
        {
            System.out.println("Unprepared IPS for Bochs PIT: "+ ips + "defaulting to following Bochs ints..");
            cycles = null;
        }
        else
            cycles = timings.get(ips);
    }

    // must be called after getNextExpiry()
    public int getOut()
    {
        return index % 2;
    }

    public long getNextExpiry()
    {
        if (cycles == null)
        {
            index++;
            return Integer.MAX_VALUE;
        }
        return cycles[index++];
    }
}
