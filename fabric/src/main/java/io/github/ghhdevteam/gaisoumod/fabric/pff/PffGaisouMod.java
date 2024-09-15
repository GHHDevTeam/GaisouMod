package io.github.ghhdevteam.gaisoumod.fabric.pff;

import com.ptk671.pffloader.api.block.PffBlock;
import com.ptk671.pffloader.api.block.PffBlockSettings;
import com.ptk671.pffloader.api.item.PffBlockItem;
import com.ptk671.pffloader.api.item.PffItem;
import com.ptk671.pffloader.api.item.PffItemSettings;
import com.ptk671.pffloader.api.itemgroup.PffItemGroup;
import com.ptk671.pffloader.api.registry.PffRegistry;
import com.ptk671.pffloader.api.util.PffIdentifier;

public class PffGaisouMod {

    //MODID
    public static String MOD_ID = "sample";

    //アイテム作成
    public static PffItem TEST_ITEM = new PffItem(new PffItemSettings());

    //ブロックの作成
    public static PffBlock TEST_BLOCk = new PffBlock(new PffBlockSettings());

    //ブロックアイテムの作成
    public static PffBlockItem TEST_BLOCK_ITEM = new PffBlockItem(TEST_BLOCk, new PffItemSettings());

    //アイテムグループ作成
    public static PffItemGroup TEST_GROUP = new PffItemGroup(PffIdentifier.of(MOD_ID, "test_tab"))
            //クリエイティブタブにアイテムを追加
            .appendItems(TEST_ITEM);

    public static void init() {
        //アイテムの登録
        PffRegistry.PffItemRegistry(PffIdentifier.of(MOD_ID, "test"),TEST_ITEM);

        //ブロックの登録
        PffRegistry.PffBlockRegistry(PffIdentifier.of(MOD_ID,"test_block"), TEST_BLOCk);

        //ブロックアイテムの登録
        PffRegistry.PffItemRegistry(PffIdentifier.of(MOD_ID,"test_block"),TEST_BLOCK_ITEM);

        //アイテムグループの登録
        PffRegistry.PffItemGroupRegistry(TEST_GROUP);

    }
}
