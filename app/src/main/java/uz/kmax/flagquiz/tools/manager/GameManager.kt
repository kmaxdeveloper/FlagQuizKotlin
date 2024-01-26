package uz.kmax.flagquiz.tools.manager

import uz.kmax.flagquiz.R
import uz.kmax.flagquiz.data.GameData

class GameManager {

    private var dataManager = DataManager()

    fun getData(type : Int):ArrayList<GameData>{
        val gameList = ArrayList<GameData>()

        when(type){
            1->{
                gameList.addAll(asian())
            }
            2->{
                gameList.addAll(europa())
            }
            3->{
                gameList.addAll(africa())
            }
            4->{
                gameList.addAll(nAmerica())
            }
            5->{
                gameList.addAll(sAmerica())
            }
            6->{
                gameList.addAll(oceania())
            }
        }
        return gameList
    }

    fun asian(): ArrayList<GameData>{
        val listGame = ArrayList<GameData>()
        for (i in 0 until dataManager.Asian.size){
            listGame.add(GameData(dataManager.Asian[i],dataManager.AsiantrueAndFalse[i],dataManager.AsianName[i]))
        }
        return listGame
    }

    private fun europa(): ArrayList<GameData>{
        val listGame = ArrayList<GameData>()
        for (i in 0 until dataManager.Europa.size){
            listGame.add(GameData(dataManager.Europa[i],dataManager.EuropaTrueAndFalse[i],dataManager.EuropaName[i]))
        }
        return listGame
    }

    private fun africa(): ArrayList<GameData>{
        val listGame = ArrayList<GameData>()
        for (i in 0 until dataManager.africa.size){
            listGame.add(GameData(dataManager.africa[i],dataManager.africaTrueAndFalse[i],dataManager.africaName[i]))
        }
        return listGame
    }

    private fun nAmerica(): ArrayList<GameData>{
        val listGame = ArrayList<GameData>()
        for (i in 0 until dataManager.NAmerica.size){
            listGame.add(GameData(dataManager.NAmerica[i],dataManager.NAmericaTrueAndFalse[i],dataManager.NAmericaName[i]))
        }
        return listGame
    }

    private fun sAmerica(): ArrayList<GameData>{
        val listGame = ArrayList<GameData>()
        for (i in 0 until dataManager.SAmerica.size){
            listGame.add(GameData(dataManager.SAmerica[i],dataManager.SAmericaTrueAndFalse[i],dataManager.SAmericaName[i]))
        }
        return listGame
    }

    private fun oceania(): ArrayList<GameData>{
        val listGame = ArrayList<GameData>()
        for (i in 0 until dataManager.oceania.size){
            listGame.add(GameData(dataManager.oceania[i],dataManager.oceaniaTrueAndFalse[i],dataManager.oceaniaName[i]))
        }
        return listGame
    }

    fun getLevelSize(type: Int):Int{
        when(type){
            1->{return dataManager.Asian.size}
            2->{return dataManager.Europa.size}
            3->{return dataManager.africa.size}
            4->{return dataManager.NAmerica.size}
            5->{return dataManager.SAmerica.size}
            6->{return dataManager.oceania.size}
        }
        return 0
    }

    fun getLevelText(type: Int):Int{
        when(type){
            1->{return R.string.level_asian}
            2->{return R.string.level_europa}
            3->{return R.string.level_africa}
            4->{return R.string.level_namerica}
            5->{return R.string.level_samerica}
            6->{return R.string.level_oceania}
        }
        return 0
    }
}