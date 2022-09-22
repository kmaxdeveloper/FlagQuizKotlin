package uz.kmax.flagquiz.manager;

import uz.kmax.flagquiz.R;

public class ArrayGame {
    // Asian Level - Start
    public final int[] Asian = {
            R.drawable.asian_afganistan, R.drawable.europa_aland,
            R.drawable.asian_armenia,    R.drawable.africa_algeria,
            R.drawable.asian_azerbaijan, R.drawable.europa_andorra,
            R.drawable.asian_bahrain,    R.drawable.namerica_anguilla,
            R.drawable.asian_bangladesh, R.drawable.europa_belarus,
            R.drawable.asian_bhutan,     R.drawable.samerica_argentina,
            R.drawable.asian_brunei,     R.drawable.europa_bosnia,
            R.drawable.asian_china,      R.drawable.europa_bulgaria,
            R.drawable.asian_georgia,    R.drawable.europa_chernogoria,
            R.drawable.asian_hongkok,    R.drawable.africa_angola,
            R.drawable.asian_india,      R.drawable.europa_denmark,
            R.drawable.asian_indionesia, R.drawable.oceania_australia,
            R.drawable.asian_iran,       R.drawable.europa_farerisland,
            R.drawable.asian_iraq,       R.drawable.europa_finland,
            R.drawable.asian_island,     R.drawable.europa_fransia,
            R.drawable.asian_israel,     R.drawable.europa_germany,
            R.drawable.asian_japan,      R.drawable.oceania_christmasisland,
            R.drawable.asian_jordan,     R.drawable.europa_greeland,
            R.drawable.asian_kambodja,   R.drawable.europa_gretsia,
            R.drawable.asian_kazakstan,  R.drawable.europa_guernsey,
            R.drawable.asian_kirgzistan, R.drawable.europa_hungry,
            R.drawable.asian_laos,       R.drawable.europa_irlandia,
            R.drawable.asian_lebanon,    R.drawable.europa_island,
            R.drawable.asian_makao,      R.drawable.europa_ispania,
            R.drawable.asian_malasia,    R.drawable.europa_italia,
            R.drawable.asian_maldiv,     R.drawable.europa_jersey,
            R.drawable.asian_mongolia,   R.drawable.europa_kosovo,
            R.drawable.asian_myanmar,    R.drawable.europa_latviya,
            R.drawable.asian_nepal,      R.drawable.europa_lihtenshteyn,
            R.drawable.asian_northkorea, R.drawable.europa_litva,
            R.drawable.asian_omon,       R.drawable.europa_luxemburg,
            R.drawable.asian_pakistan,   R.drawable.europa_macedonia,
            R.drawable.asian_palastine,  R.drawable.europa_malta,
            R.drawable.asian_phillipines, R.drawable.europa_moldovia,
            R.drawable.asian_qatar,      R.drawable.europa_netherland,
            R.drawable.asian_quwait,     R.drawable.europa_norwey,
            R.drawable.asian_saudiaarabia, R.drawable.europa_poland,
            R.drawable.asian_singapure,  R.drawable.europa_potugalia,
            R.drawable.asian_southkorea, R.drawable.europa_romania,
            R.drawable.asian_srilanka,   R.drawable.europa_russia,
            R.drawable.asian_syria,      R.drawable.europa_sanmarino,
            R.drawable.asian_syrus,      R.drawable.europa_scotland,
            R.drawable.asian_taiwan,     R.drawable.europa_serbia,
            R.drawable.asian_tajikistan, R.drawable.europa_shvetsariya,
            R.drawable.asian_thailand,   R.drawable.europa_shvetsiya,
            R.drawable.asian_timor,      R.drawable.europa_slavakia,
            R.drawable.asian_turkey,     R.drawable.europa_slavenia,
            R.drawable.asian_turkmanistan, R.drawable.europa_uels,
            R.drawable.asian_uae,        R.drawable.europa_uk,
            R.drawable.asian_uzbekistan, R.drawable.europa_ukraine,
            R.drawable.asian_vietnam,    R.drawable.europa_vatikan,
            R.drawable.asian_yeman,      R.drawable.europa_xorvatia,
    };

    public final int[] AsiantrueAndFalse = {
            0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
            0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
    };

    public final int[] AsianName = {
            R.string.asian_afganistan, R.string.europa_aland,
            R.string.asian_armenia,    R.string.africa_algeria,
            R.string.asian_azerbaijan, R.string.europa_andorra,
            R.string.asian_bahrain,    R.string.namerica_anguilla,
            R.string.asian_bangladesh, R.string.europa_belarus,
            R.string.asian_Bhutan,     R.string.samerica_argentina,
            R.string.asian_brunei,     R.string.europa_bosniya,
            R.string.asian_china,      R.string.europa_bulgaria,
            R.string.asian_georgia,    R.string.europa_chernagoriya,
            R.string.asian_honkok,     R.string.africa_angola,
            R.string.asian_india,      R.string.europa_denmark,
            R.string.asian_indonesia,  R.string.oceania_australia,
            R.string.asian_iran,       R.string.europa_farerisland,
            R.string.asian_iraq,       R.string.europa_finland,
            R.string.asian_island,     R.string.europa_france,
            R.string.asian_israel,     R.string.europa_germany,
            R.string.asian_japan,      R.string.oceania_cristmasisland,
            R.string.asian_jordan,     R.string.europa_greeland,
            R.string.asian_kambodja,   R.string.europa_greece,
            R.string.asian_kazahkstan , R.string.europa_guernsey,
            R.string.asian_kyrgyzstan, R.string.europa_hungary,
            R.string.asian_laos,       R.string.europa_ireland,
            R.string.asian_lebanon,    R.string.europa_iceland,
            R.string.asian_makao,      R.string.europa_ispania,
            R.string.asian_malaysia,   R.string.europa_italy,
            R.string.asian_maldives,   R.string.europa_jersey,
            R.string.asian_mongolia,   R.string.europa_kosovo,
            R.string.asian_myanmar,    R.string.europa_latvia,
            R.string.asian_nepal,      R.string.europa_liechtenstein,
            R.string.asian_northkorea, R.string.europa_lithuania,
            R.string.asian_oman,       R.string.europa_luxemburg,
            R.string.asian_pakistan,   R.string.europa_macedonia,
            R.string.asian_palestine,  R.string.europa_malta,
            R.string.asian_philippines, R.string.europa_moldova,
            R.string.asian_qatar,      R.string.europa_netherlands,
            R.string.asian_quwait,     R.string.europa_norway,
            R.string.asian_saudiarabia, R.string.europa_poland,
            R.string.asian_singapore,  R.string.europa_portugal,
            R.string.asian_southkorea, R.string.europa_romania,
            R.string.asian_srilanka,   R.string.europa_Russia,
            R.string.asian_syria,      R.string.europa_sanmarino,
            R.string.asian_syrus,      R.string.europa_scotland,
            R.string.asian_taiwan,     R.string.europa_serbia,
            R.string.asian_tajikistan, R.string.europa_switzerland,
            R.string.asian_thailand,   R.string.europa_sweeden,
            R.string.asian_timorleste, R.string.europa_slovakia,
            R.string.asian_turkey,     R.string.europa_slovenia,
            R.string.asian_turkmanistan, R.string.europa_uels,
            R.string.asian_uae,        R.string.europa_unitedkingdom,
            R.string.asian_uzbekistan, R.string.europa_ukraine,
            R.string.asian_vietnam,    R.string.europa_vatican,
            R.string.asian_yeman,      R.string.europa_croatia,
    };
    // Asian massivini yakuni - End
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Europa massivini boshlanishi - Start
    public final int[] Europa = {
            R.drawable.asian_afganistan, R.drawable.europa_aland,
            R.drawable.asian_armenia,    R.drawable.europa_albania,
            R.drawable.asian_azerbaijan, R.drawable.europa_andorra,
            R.drawable.asian_bahrain,    R.drawable.europa_austria,
            R.drawable.asian_bangladesh, R.drawable.europa_belarus,
            R.drawable.asian_bhutan,     R.drawable.europa_belgium,
            R.drawable.asian_brunei,     R.drawable.europa_bosnia,
            R.drawable.asian_china,      R.drawable.europa_bulgaria,
            R.drawable.asian_georgia,    R.drawable.europa_chernogoria,
            R.drawable.asian_hongkok,    R.drawable.europa_czech,
            R.drawable.asian_india,      R.drawable.europa_denmark,
            R.drawable.asian_indionesia, R.drawable.europa_estonia,
            R.drawable.asian_iran,       R.drawable.europa_farerisland,
            R.drawable.asian_iraq,       R.drawable.europa_finland,
            R.drawable.asian_island,     R.drawable.europa_fransia,
            R.drawable.asian_israel,     R.drawable.europa_germany,
            R.drawable.asian_japan,      R.drawable.europa_gibraltar,
            R.drawable.asian_jordan,     R.drawable.europa_greeland,
            R.drawable.asian_kambodja,   R.drawable.europa_gretsia,
            R.drawable.asian_kazakstan,  R.drawable.europa_guernsey,
            R.drawable.asian_kirgzistan, R.drawable.europa_hungry,
            R.drawable.asian_laos,       R.drawable.europa_irlandia,
            R.drawable.asian_lebanon,    R.drawable.europa_island,
            R.drawable.asian_makao,      R.drawable.europa_ispania,
            R.drawable.asian_malasia,    R.drawable.europa_italia,
            R.drawable.asian_maldiv,     R.drawable.europa_jersey,
            R.drawable.asian_mongolia,   R.drawable.europa_kosovo,
            R.drawable.asian_myanmar,    R.drawable.europa_latviya,
            R.drawable.asian_nepal,      R.drawable.europa_lihtenshteyn,
            R.drawable.asian_northkorea, R.drawable.europa_litva,
            R.drawable.asian_omon,       R.drawable.europa_luxemburg,
            R.drawable.asian_pakistan,   R.drawable.europa_macedonia,
            R.drawable.asian_palastine,  R.drawable.europa_malta,
            R.drawable.asian_phillipines, R.drawable.europa_moldovia,
            R.drawable.asian_qatar,      R.drawable.europa_netherland,
            R.drawable.asian_quwait,     R.drawable.europa_norwey,
            R.drawable.asian_saudiaarabia, R.drawable.europa_poland,
            R.drawable.asian_singapure,  R.drawable.europa_potugalia,
            R.drawable.asian_southkorea, R.drawable.europa_romania,
            R.drawable.asian_srilanka,   R.drawable.europa_russia,
            R.drawable.asian_syria,      R.drawable.europa_sanmarino,
            R.drawable.asian_syrus,      R.drawable.europa_scotland,
            R.drawable.asian_taiwan,     R.drawable.europa_serbia,
            R.drawable.asian_tajikistan, R.drawable.europa_shvetsariya,
            R.drawable.asian_thailand,   R.drawable.europa_shvetsiya,
            R.drawable.asian_timor,      R.drawable.europa_slavakia,
            R.drawable.asian_turkey,     R.drawable.europa_slavenia,
            R.drawable.asian_turkmanistan, R.drawable.europa_uels,
            R.drawable.asian_uae,        R.drawable.europa_uk,
            R.drawable.asian_uzbekistan, R.drawable.europa_ukraine,
            R.drawable.asian_vietnam,    R.drawable.europa_vatikan,
            R.drawable.asian_yeman,      R.drawable.europa_xorvatia,
    };

    public final int[] EuropaTrueAndFalse = {
            0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
            0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
    };

    public final int[] EuropaName = {
            R.string.asian_afganistan, R.string.europa_aland,
            R.string.asian_armenia,    R.string.europa_albania,
            R.string.asian_azerbaijan, R.string.europa_andorra,
            R.string.asian_bahrain,    R.string.europa_austria,
            R.string.asian_bangladesh, R.string.europa_belarus,
            R.string.asian_Bhutan,     R.string.europa_belgium,
            R.string.asian_brunei,     R.string.europa_bosniya,
            R.string.asian_china,      R.string.europa_bulgaria,
            R.string.asian_georgia,    R.string.europa_chernagoriya,
            R.string.asian_honkok,     R.string.europa_czechrepublic,
            R.string.asian_india,      R.string.europa_denmark,
            R.string.asian_indonesia,  R.string.europa_estonia,
            R.string.asian_iran,       R.string.europa_farerisland,
            R.string.asian_iraq,       R.string.europa_finland,
            R.string.asian_island,     R.string.europa_france,
            R.string.asian_israel,     R.string.europa_germany,
            R.string.asian_japan,      R.string.europa_gibraltar,
            R.string.asian_jordan,     R.string.europa_greeland,
            R.string.asian_kambodja,   R.string.europa_greece,
            R.string.asian_kazahkstan , R.string.europa_guernsey,
            R.string.asian_kyrgyzstan, R.string.europa_hungary,
            R.string.asian_laos,       R.string.europa_ireland,
            R.string.asian_lebanon,    R.string.europa_iceland,
            R.string.asian_makao,      R.string.europa_ispania,
            R.string.asian_malaysia,   R.string.europa_italy,
            R.string.asian_maldives,   R.string.europa_jersey,
            R.string.asian_mongolia,   R.string.europa_kosovo,
            R.string.asian_myanmar,    R.string.europa_latvia,
            R.string.asian_nepal,      R.string.europa_liechtenstein,
            R.string.asian_northkorea, R.string.europa_lithuania,
            R.string.asian_oman,       R.string.europa_luxemburg,
            R.string.asian_pakistan,   R.string.europa_macedonia,
            R.string.asian_palestine,  R.string.europa_malta,
            R.string.asian_philippines, R.string.europa_moldova,
            R.string.asian_qatar,      R.string.europa_netherlands,
            R.string.asian_quwait,     R.string.europa_norway,
            R.string.asian_saudiarabia, R.string.europa_poland,
            R.string.asian_singapore,  R.string.europa_portugal,
            R.string.asian_southkorea, R.string.europa_romania,
            R.string.asian_srilanka,   R.string.europa_Russia,
            R.string.asian_syria,      R.string.europa_sanmarino,
            R.string.asian_syrus,      R.string.europa_scotland,
            R.string.asian_taiwan,     R.string.europa_serbia,
            R.string.asian_tajikistan, R.string.europa_switzerland,
            R.string.asian_thailand,   R.string.europa_sweeden,
            R.string.asian_timorleste, R.string.europa_slovakia,
            R.string.asian_turkey,     R.string.europa_slovenia,
            R.string.asian_turkmanistan, R.string.europa_uels,
            R.string.asian_uae,        R.string.europa_unitedkingdom,
            R.string.asian_uzbekistan, R.string.europa_ukraine,
            R.string.asian_vietnam,    R.string.europa_vatican,
            R.string.asian_yeman,      R.string.europa_croatia,
    };
    // Europa massivini boshlanishi - End
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Afrika kodi boshlanishi - Start
    public final int[] africa = {
            R.drawable.africa_algeria, R.drawable.europa_slavenia,
            R.drawable.africa_angola,  R.drawable.asian_yeman,
            R.drawable.africa_benin,   R.drawable.asian_vietnam,
            R.drawable.africa_botswana, R.drawable.europa_xorvatia,
            R.drawable.africa_burkinofaso, R.drawable.europa_vatikan,
            R.drawable.africa_burundi, R.drawable.europa_slavenia,
            R.drawable.africa_cameroon, R.drawable.namerica_anguilla,
            R.drawable.africa_capeverde, R.drawable.namerica_bahamas,
            R.drawable.africa_central_ar, R.drawable.oceania_christmasisland,
            R.drawable.africa_chad,     R.drawable.samerica_argentina,
            R.drawable.africa_comoros,  R.drawable.europa_slavenia,
            R.drawable.africa_djibouti, R.drawable.europa_austria,
            R.drawable.africa_drotcongo, R.drawable.europa_slavenia,
            R.drawable.africa_efiopiya, R.drawable.europa_albania,
            R.drawable.africa_egypt,    R.drawable.asian_island,
            R.drawable.africa_equatorialguninea, R.drawable.asian_japan,
            R.drawable.africa_eriteria, R.drawable.europa_irlandia,
            R.drawable.africa_eswatini, R.drawable.oceania_nauru,
            R.drawable.africa_ethiopia, R.drawable.asian_makao,
            R.drawable.africa_gabon,   R.drawable.asian_northkorea,
            R.drawable.africa_gambia,  R.drawable.europa_malta,
            R.drawable.africa_ghana,   R.drawable.oceania_americansamoa,
            R.drawable.africa_guinea,  R.drawable.asian_mongolia,
            R.drawable.africa_guineabissau, R.drawable.asian_turkmanistan,
            R.drawable.africa_ivorycoast, R.drawable.samerica_bonaire,
            R.drawable.africa_kenya,   R.drawable.oceania_cocosisland,
            R.drawable.africa_lesotho, R.drawable.asian_tajikistan,
            R.drawable.africa_liberia, R.drawable.asian_quwait,
            R.drawable.africa_libya,   R.drawable.samerica_ecuador,
            R.drawable.africa_madakaskar, R.drawable.namerica_honduras,
            R.drawable.africa_malawi,  R.drawable.asian_syrus,
            R.drawable.africa_mali,    R.drawable.asian_singapure,
            R.drawable.africa_mauritania, R.drawable.asian_syria,
            R.drawable.africa_mauritius, R.drawable.europa_serbia,
            R.drawable.africa_morocco, R.drawable.europa_fransia,
            R.drawable.africa_mozambique, R.drawable.europa_italia,
            R.drawable.africa_namibia, R.drawable.europa_gretsia,
            R.drawable.africa_niger,   R.drawable.samerica_guyana,
            R.drawable.africa_nigeria, R.drawable.europa_sanmarino,
            R.drawable.africa_rotcongo, R.drawable.oceania_newcaledonia,
            R.drawable.africa_rwanda,  R.drawable.europa_slavenia,
            R.drawable.africa_saotome, R.drawable.asian_maldiv,
            R.drawable.africa_senegal, R.drawable.asian_myanmar,
            R.drawable.africa_seychelles, R.drawable.asian_uae,
            R.drawable.africa_sierraleone, R.drawable.asian_thailand,
            R.drawable.africa_somali,  R.drawable.oceania_micronesia,
            R.drawable.africa_southafrica, R.drawable.oceania_norfolkisland,
            R.drawable.africa_southsudan, R.drawable.europa_litva,
            R.drawable.africa_sudan,   R.drawable.europa_scotland,
            R.drawable.africa_tanzania, R.drawable.europa_potugalia,
            R.drawable.africa_togo,    R.drawable.asian_saudiaarabia,
            R.drawable.africa_tunis,   R.drawable.asian_kirgzistan,
            R.drawable.africa_uganda,  R.drawable.asian_srilanka,
            R.drawable.africa_zambia,  R.drawable.asian_phillipines,
            R.drawable.africa_zimbabwe, R.drawable.asian_laos,
    };
    public final int[] africaTrueAndFalse = {
            0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,
            1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
    };
    public final int[] africaName = {
            R.string.africa_algeria,  R.string.europa_slovenia, // 1
            R.string.africa_angola,   R.string.asian_yeman,  // 2
            R.string.africa_benin,    R.string.asian_vietnam, // 3
            R.string.africa_botswana, R.string.europa_croatia, // 4
            R.string.africa_burkinofaso, R.string.europa_vatican, // 5
            R.string.africa_burundi,  R.string.europa_slovenia, // 6
            R.string.africa_cameroon, R.string.namerica_anguilla, // 7
            R.string.africa_caboverde, R.string.namerica_bahamas, // 8
            R.string.africa_centralafricaR, R.string.oceania_cristmasisland, // 9
            R.string.africa_chad,     R.string.samerica_argentina, // 10
            R.string.africa_comoros,  R.string.europa_slovenia, // 11
            R.string.africa_djibouti, R.string.europa_austria, //12
            R.string.africa_Dcongo,   R.string.europa_slovenia, //13
            R.string.africa_ethiopia, R.string.europa_albania, //14
            R.string.africa_egypt,    R.string.asian_island, //15
            R.string.africa_equatorialguinea, R.string.asian_japan, //16
            R.string.africa_eruteria, R.string.europa_ireland, //17
            R.string.africa_eswatini, R.string.oceania_nauru, // 18
            R.string.africa_ethiopia, R.string.asian_makao, //19
            R.string.africa_gabon,    R.string.asian_northkorea, //20
            R.string.africa_gambia,   R.string.europa_malta, //21
            R.string.africa_ghana,    R.string.oceania_americansamoa, //22
            R.string.africa_guinea,   R.string.asian_mongolia, // 23
            R.string.africa_guineaBissau, R.string.asian_turkmanistan, // 24
            R.string.africa_cotedivoire, R.string.samerica_bonaire, // 25
            R.string.africa_kenya,    R.string.oceania_cocosisland, // 26
            R.string.africa_lesotho,  R.string.asian_tajikistan, //27
            R.string.africa_liberia,  R.string.asian_quwait, // 28
            R.string.africa_libya,    R.string.samerica_ecuador, //29
            R.string.africa_madagaskar, R.string.namerica_honduras, // 30
            R.string.africa_malawi,   R.string.asian_syrus, // 31
            R.string.africa_mali,     R.string.asian_singapore, // 32
            R.string.africa_mauritania, R.string.asian_syria, // 33
            R.string.africa_mauritius, R.string.europa_serbia, // 34
            R.string.africa_morocco,  R.string.europa_france, // 35
            R.string.africa_mozambique, R.string.europa_italy, // 36
            R.string.africa_namibia,  R.string.europa_greece, // 37
            R.string.africa_niger,    R.string.samerica_guyana, // 38
            R.string.africa_nigeria,  R.string.europa_sanmarino, // 39
            R.string.africa_Rcongo,   R.string.oceania_newcaledoni, // 40
            R.string.africa_rwanda,   R.string.europa_slovenia, // 41
            R.string.africa_saotome,  R.string.asian_maldives, // 42
            R.string.africa_senegal,  R.string.asian_myanmar, // 43
            R.string.africa_seychellas, R.string.asian_uae, // 44
            R.string.africa_sierraleone, R.string.asian_thailand, // 45
            R.string.africa_somalia,  R.string.oceania_micronesia, // 46
            R.string.africa_southafrica, R.string.oceania_norkfolkisland, // 47
            R.string.africa_southsudan, R.string.europa_lithuania, // 48
            R.string.africa_sydan,    R.string.europa_scotland, // 49
            R.string.africa_tanzaniya, R.string.europa_portugal, //50
            R.string.africa_togo,     R.string.asian_saudiarabia, // 51
            R.string.africa_tunisia,  R.string.asian_kyrgyzstan, // 52
            R.string.africa_uganda,   R.string.asian_srilanka, // 53
            R.string.africa_zambia,   R.string.asian_philippines, // 54
            R.string.africa_zimbabwe, R.string.asian_laos, // 55
    };
    // Afrika kodi Yakuni - End
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Shimoliy Amerika boshlanish kodi - Start
    public final int[] NAmerica = {
            R.drawable.namerica_anguilla, R.drawable.asian_laos,
            R.drawable.namerica_antigua,  R.drawable.asian_phillipines,
            R.drawable.namerica_bahamas,  R.drawable.europa_potugalia,
            R.drawable.namerica_barbados, R.drawable.africa_ethiopia,
            R.drawable.namerica_belize,   R.drawable.oceania_norfolkisland,
            R.drawable.namerica_canada,   R.drawable.asian_srilanka,
            R.drawable.namerica_costarica, R.drawable.asian_singapure,
            R.drawable.namerica_cuba,     R.drawable.europa_litva,
            R.drawable.namerica_dominica, R.drawable.europa_gretsia,
            R.drawable.namerica_dominikanrepublic, R.drawable.oceania_newcaledonia,
            R.drawable.namerica_elsalvador, R.drawable.oceania_kiribati,
            R.drawable.namerica_grenada,  R.drawable.asian_mongolia,
            R.drawable.namerica_guatemala, R.drawable.asian_southkorea,
            R.drawable.namerica_haiti,    R.drawable.asian_kazakstan,
            R.drawable.namerica_honduras, R.drawable.africa_egypt,
            R.drawable.namerica_jamaica,  R.drawable.asian_turkey,
            R.drawable.namerica_mexico,   R.drawable.asian_indionesia,
            R.drawable.namerica_nicaragua, R.drawable.asian_india,
            R.drawable.namerica_panama,   R.drawable.europa_greeland,
            R.drawable.namerica_puertoriko, R.drawable.europa_poland,
            R.drawable.namerica_saintkitts, R.drawable.asian_nepal,
            R.drawable.namerica_saintlucia, R.drawable.asian_kambodja,
            R.drawable.namerica_saintvincent, R.drawable.europa_uels,
            R.drawable.namerica_trinandandtobogo, R.drawable.africa_tanzania,
            R.drawable.namerica_usa,      R.drawable.asian_uzbekistan,

    };
    public final int[] NAmericaTrueAndFalse = {
            0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
    };
    public final int[] NAmericaName = {
            R.string.namerica_anguilla,    R.string.asian_laos,
            R.string.namerica_antiguaandB, R.string.asian_philippines,
            R.string.namerica_bahamas,     R.string.europa_portugal,
            R.string.namerica_barbados,    R.string.africa_ethiopia,
            R.string.namerica_belize,      R.string.oceania_norkfolkisland,
            R.string.namerica_canada,      R.string.asian_srilanka,
            R.string.namerica_costarica,   R.string.asian_singapore,
            R.string.namerica_cuba,        R.string.europa_lithuania,
            R.string.namerica_dominica,    R.string.europa_greece,
            R.string.namerica_dominicanRepublic, R.string.oceania_newcaledoni,
            R.string.namerica_elsalvador,  R.string.oceania_kiribati,
            R.string.namerica_grenada,     R.string.asian_mongolia,
            R.string.namerica_guatemala,   R.string.asian_southkorea,
            R.string.namerica_haiti,       R.string.asian_kazahkstan,
            R.string.namerica_honduras,    R.string.africa_egypt,
            R.string.namerica_jamaica,     R.string.asian_turkey,
            R.string.namerica_mexico,      R.string.asian_indonesia,
            R.string.namerica_nicaragua,   R.string.asian_india,
            R.string.namerica_panama,      R.string.europa_greeland,
            R.string.namerica_puertoriko,  R.string.europa_poland,
            R.string.namerica_saintkitts,  R.string.asian_nepal,
            R.string.namerica_saintlucia,  R.string.asian_kambodja,
            R.string.namerica_saintVincent, R.string.europa_uels,
            R.string.namerica_trinadandT,  R.string.africa_tanzaniya,
            R.string.namerica_usa,         R.string.asian_uzbekistan,
    };
    // Shimoliy Amerika yakuni kodi - End
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Janubiy Amerika boshlanish kodi - Start
    public final int[] SAmerica = {
            R.drawable.samerica_argentina, R.drawable.asian_india,
            R.drawable.samerica_aruba,     R.drawable.namerica_usa,
            R.drawable.samerica_bolivia,   R.drawable.namerica_mexico,
            R.drawable.samerica_bonaire,   R.drawable.europa_potugalia,
            R.drawable.samerica_brazilia,  R.drawable.europa_italia,
            R.drawable.samerica_chile,     R.drawable.asian_japan,
            R.drawable.samerica_colombia,  R.drawable.asian_taiwan,
            R.drawable.samerica_ecuador,   R.drawable.europa_malta,
            R.drawable.samerica_falklandisland, R.drawable.europa_farerisland,
            R.drawable.samerica_frenchguiana, R.drawable.africa_mali,
            R.drawable.samerica_guyana,    R.drawable.oceania_newzealand,
            R.drawable.samerica_paraguay,  R.drawable.africa_malawi,
            R.drawable.samerica_peru,      R.drawable.asian_indionesia,
            R.drawable.samerica_sandwichisland, R.drawable.europa_gretsia,
            R.drawable.samerica_suriname,  R.drawable.asian_turkey,
            R.drawable.samerica_uruguay,   R.drawable.asian_uzbekistan,
            R.drawable.samerica_venezuela, R.drawable.asian_kazakstan,
    };
    public final int[] SAmericaTrueAndFalse = {
            0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
    };
    public final int[] SAmericaName = {
            R.string.samerica_argentina, R.string.asian_india,
            R.string.samerica_aruba, R.string.namerica_usa,
            R.string.samerica_bolivia, R.string.namerica_mexico,
            R.string.samerica_bonaire, R.string.europa_portugal,
            R.string.samerica_brazil, R.string.europa_italy,
            R.string.samerica_chile, R.string.asian_japan,
            R.string.samerica_colombia, R.string.asian_taiwan,
            R.string.samerica_ecuador, R.string.europa_malta,
            R.string.samerica_falklandI, R.string.europa_farerisland,
            R.string.samerica_FrenchG, R.string.africa_mali,
            R.string.samerica_guyana, R.string.oceania_newzealand,
            R.string.samerica_paragvay, R.string.africa_malawi,
            R.string.samerica_peru, R.string.asian_indonesia,
            R.string.samerica_sandwichisland, R.string.europa_greece,
            R.string.samerica_suriname, R.string.asian_turkey,
            R.string.samerica_uruguay, R.string.asian_uzbekistan,
            R.string.samerica_venezuela, R.string.asian_kazahkstan,
    };
    // Janubiy Amerika yakuni kodi - End
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Okeaniya boshlanishi - Start
    public final int[] oceania = {
            R.drawable.oceania_americansamoa, R.drawable.asian_india,
            R.drawable.oceania_australia,     R.drawable.africa_tanzania,
            R.drawable.oceania_christmasisland, R.drawable.asian_tajikistan,
            R.drawable.oceania_cocosisland,   R.drawable.asian_afganistan,
            R.drawable.oceania_cookisland,    R.drawable.asian_iran,
            R.drawable.oceania_fiji,          R.drawable.europa_kosovo,
            R.drawable.oceania_frenchpolinesia, R.drawable.africa_drotcongo,
            R.drawable.oceania_guam,          R.drawable.europa_czech,
            R.drawable.oceania_kiribati,      R.drawable.namerica_usa,
            R.drawable.oceania_marianaisland, R.drawable.samerica_guyana,
            R.drawable.oceania_marshallisland, R.drawable.europa_uels,
            R.drawable.oceania_micronesia,    R.drawable.samerica_argentina,
            R.drawable.oceania_nauru,         R.drawable.asian_turkey,
            R.drawable.oceania_newcaledonia,  R.drawable.asian_kazakstan,
            R.drawable.oceania_newzealand,    R.drawable.africa_burkinofaso,
            R.drawable.oceania_norfolkisland, R.drawable.africa_gambia,
            R.drawable.oceania_palau,         R.drawable.samerica_aruba,
            R.drawable.oceania_papua,         R.drawable.namerica_jamaica,
            R.drawable.oceania_pitcairnisland, R.drawable.asian_japan,
            R.drawable.oceania_samoa,         R.drawable.asian_turkmanistan,
            R.drawable.oceania_tokelau,       R.drawable.europa_ukraine,
            R.drawable.oceania_tonga,         R.drawable.asian_kirgzistan,
            R.drawable.oceania_tuvalu,        R.drawable.asian_mongolia,
            R.drawable.oceania_vanuatu,       R.drawable.namerica_mexico,
            R.drawable.oceania_wallisandfutuna, R.drawable.asian_myanmar,
    };
    public final int[] oceaniaTrueAndFalse = {
            0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
    };
    public final int[] oceaniaName = {
            R.string.oceania_americansamoa, R.string.asian_india,
            R.string.oceania_australia,     R.string.africa_tanzaniya,
            R.string.oceania_cristmasisland, R.string.asian_tajikistan,
            R.string.oceania_cocosisland,   R.string.asian_afganistan,
            R.string.oceania_cookisland,    R.string.asian_iran,
            R.string.oceania_fiji,          R.string.europa_kosovo,
            R.string.oceania_frenchpolineziya, R.string.africa_Dcongo,
            R.string.oceania_guam,          R.string.europa_czechrepublic,
            R.string.oceania_kiribati,      R.string.namerica_usa,
            R.string.oceania_marianaisland, R.string.samerica_guyana,
            R.string.oceania_marshall,      R.string.europa_uels,
            R.string.oceania_micronesia,    R.string.samerica_argentina,
            R.string.oceania_nauru,         R.string.asian_turkey,
            R.string.oceania_newcaledoni,   R.string.asian_kazahkstan,
            R.string.oceania_newzealand,    R.string.africa_burkinofaso,
            R.string.oceania_norkfolkisland, R.string.africa_gambia,
            R.string.oceania_palau,         R.string.samerica_aruba,
            R.string.oceania_papua,         R.string.namerica_jamaica,
            R.string.oceania_pitcairnisland, R.string.asian_japan,
            R.string.oceania_samoa,         R.string.asian_turkmanistan,
            R.string.oceania_tokelau,       R.string.europa_ukraine,
            R.string.oceania_tonga,         R.string.asian_kyrgyzstan,
            R.string.oceania_tuvalu,        R.string.asian_mongolia,
            R.string.oceania_vanuatu,       R.string.namerica_mexico,
            R.string.oceania_wallisandfutuna, R.string.asian_myanmar,
    };
    // Okeaniya Yakuni - End
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

}
