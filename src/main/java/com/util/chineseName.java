package com.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * Created by wzy on 2019/1/25 17:42
 **/
public class chineseName {
    public static String getName(){
//        Random random=new Random(System.currentTimeMillis());
        /* 598 百家姓 */
        String[] familyName= {"赵","钱","孙","李","周","吴","郑","王","冯","陈","褚","卫","蒋","沈","韩","杨","朱","秦","尤","许",
                "何","吕","施","张","孔","曹","严","华","金","魏","陶","姜","戚","谢","邹","喻","柏","水","窦","章","云","苏","潘","葛","奚","范","彭","郎",
                "鲁","韦","昌","马","苗","凤","花","方","俞","任","袁","柳","酆","鲍","史","唐","费","廉","岑","薛","雷","贺","倪","汤","滕","殷",
                "罗","毕","郝","邬","安","常","乐","于","时","傅","皮","卞","齐","康","伍","余","元","卜","顾","孟","平","黄","和",
                "穆","萧","尹","姚","邵","湛","汪","祁","毛","禹","狄","米","贝","明","臧","计","伏","成","戴","谈","宋","茅","庞","熊","纪","舒",
                "屈","项","祝","董","梁","杜","阮","蓝","闵","席","季","麻","强","贾","路","娄","危","江","童","颜","郭","梅","盛","林","刁","钟",
                "徐","邱","骆","高","夏","蔡","田","樊","胡","凌","霍","虞","万","支","柯","昝","管","卢","莫","经","房","裘","缪","干","解","应",
                "宗","丁","宣","贲","邓","郁","单","杭","洪","包","诸","左","石","崔","吉","钮","龚","程","嵇","邢","滑","裴","陆","荣","翁","荀",
                "羊","于","惠","甄","曲","家","封","芮","羿","储","靳","汲","邴","糜","松","井","段","富","巫","乌","焦","巴","弓","牧","隗","山",
                "谷","车","侯","宓","蓬","全","郗","班","仰","秋","仲","伊","宫","宁","仇","栾","暴","甘","钭","厉","戎","祖","武","符","刘","景",
                "詹","束","龙","叶","幸","司","韶","郜","黎","蓟","溥","印","宿","白","怀","蒲","邰","从","鄂","索","咸","籍","赖","卓","蔺","屠",
                "蒙","池","乔","阴","郁","胥","能","苍","双","闻","莘","党","翟","谭","贡","劳","逄","姬","申","扶","堵","冉","宰","郦","雍","却",
                "璩","桑","桂","濮","牛","寿","通","边","扈","燕","冀","浦","尚","农","温","别","庄","晏","柴","瞿","阎","充","慕","连","茹","习",
                "宦","艾","鱼","容","向","古","易","慎","戈","廖","庾","终","暨","居","衡","步","都","耿","满","弘","匡","国","文","寇","广","禄",
                "阙","东","欧","殳","沃","利","蔚","越","夔","隆","师","巩","厍","聂","晁","勾","敖","融","冷","訾","辛","阚","那","简","饶","空",
                "曾","毋","沙","乜","养","鞠","须","丰","巢","关","蒯","相","查","后","荆","红","游","郏","竺","权","逯","盖","益","桓","公","仉",
                "督","岳","帅","缑","亢","况","郈","有","琴","归","海","晋","楚","闫","法","汝","鄢","涂","钦","商","牟","佘","佴","伯","赏","墨",
                "哈","谯","篁","年","爱","阳","佟","言","福","南","火","铁","迟","漆","官","冼","真","展","繁","檀","祭","密","敬","揭","舜","楼",
                "疏","冒","浑","挚","胶","随","高","皋","原","种","练","弥","仓","眭","覃","阿","门","召","仪","风","介","巨",
                "木","京","狐","郇","虎","枚","抗","达","杞","苌","折","麦","庆","过","竹","端","鲜","皇","亓","老","是","秘","畅","邝","还","宾",
                "闾","辜","纵","司马","上官","欧阳","夏侯","诸葛","闻人","东方","赫连","皇甫","羊舌","尉迟","公冶","宗正",
                "濮阳","淳于","单于","太叔","申屠","公孙","仲孙","轩辕","令狐","钟离","宇文","长孙","慕容","鲜于","闾丘","司徒","司空","兀官","司寇",
                "南门","呼延","子车","颛孙","端木","巫马","公西","漆雕","车正","壤驷","公良","拓跋","宰父","谷梁","段干","百里","东郭","微生",
                "梁丘","左丘","东门","西门","南宫","第五","公仪","公乘","太史","仲长","叔孙","屈突","尔朱","东乡","相里","胡母","司城","雍门",
                "毋丘","贺兰","屋庐","独孤","南郭","北宫","王孙"};

//        int index=random.nextInt(familyName.length-1);
//        String name = familyName[index]; //获得一个随机的姓氏
        String name = familyName[Math.round((float)Math.random()*(familyName.length-1))]; //获得一个随机的姓氏


        String[] givenName="嘉懿 煜城 懿轩 烨伟 苑博 伟泽 熠彤 鸿煊 博涛 烨霖 烨华 煜祺 智宸 正豪 昊然 明杰 立诚 立轩 立辉 峻熙 弘文 熠彤 鸿煊 烨霖 哲瀚 鑫鹏 致远 俊驰 雨泽 烨磊 晟睿 天佑 文昊 修洁 黎昕 远航 旭尧 鸿涛 伟祺 荣轩 越泽 浩宇 瑾瑜 皓轩 擎苍 擎宇 志泽 睿渊 楷瑞 子轩 弘文 哲瀚 雨泽 鑫磊 修杰 伟诚 建辉 晋鹏 天磊 绍辉 泽洋 明轩 健柏 鹏煊 昊强 伟宸 博超 君浩 子骞 明辉 鹏涛 炎彬 鹤轩 越彬 风华 靖琪 明诚 高格 光华 国源 冠宇 晗昱 涵润 翰飞 翰海 昊乾 浩博 和安 弘博 宏恺 鸿朗 华奥 华灿 嘉慕 坚秉 建明 金鑫 锦程 瑾瑜 晋鹏 经赋 景同 靖琪 君昊 俊明 季同 开济 凯安 康成 乐语 力勤 良哲 理群 茂彦 敏博 明达 朋义 彭泽 鹏举 濮存 溥心 璞瑜 浦泽 奇邃 祺祥 荣轩 锐达 睿慈 绍祺 圣杰 晟睿 思源 斯年 泰宁 天佑 同巍 奕伟 祺温 文虹 向笛 心远 欣德 新翰 兴言 星阑 修为 旭尧 炫明 学真 雪风 雅昶 阳曦 烨熠 英韶 永贞 咏德 宇寰 雨泽 玉韵 越彬 蕴和 哲彦 振海 正志 子晋 自怡 德赫 君平".split(" ");

        /* 从常用字中选取一个或两个字作为名 */
//        if(random.nextBoolean()){
//            name+=getChinese()+getChinese();
//        }else {
//            name+=getChinese();
//        }
//        try{
//            name=new String(name.getBytes(),"utf-8");
//
//        }catch (Exception e){e.printStackTrace();}
//        System.out.println(name);
//        index=random.nextInt(givenName.length-1);
        name+=givenName[Math.round((float)Math.random()*(givenName.length-1))];
        try{
            name=new String(name.getBytes(),"utf-8");

        }catch (Exception e){e.printStackTrace();}


        return name;
    }


    public static String getChinese() {
        String str = null;
        int highPos, lowPos;
        Random random = new Random();
        highPos = (176 + Math.abs(random.nextInt(71)));//区码，0xA0打头，从第16区开始，即0xB0=11*16=176,16~55一级汉字，56~87二级汉字
        random=new Random();
        lowPos = 161 + Math.abs(random.nextInt(94));//位码，0xA0打头，范围第1~94列

        byte[] bArr = new byte[2];
        bArr[0] = (new Integer(highPos)).byteValue();
        bArr[1] = (new Integer(lowPos)).byteValue();
        try {
            str = new String(bArr, "GB2312");	//区位码组合成汉字
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

}
