package jp.co.tepi.unocalculator.db.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Player(val name: String) {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

}