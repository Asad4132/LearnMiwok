package com.example.learnmiwok

class Word {

    /** Default translation for the word  */
    private var defaultTranslation: String? = null

    /** Miwok translation for the word  */
    private var miwokTranslation: String? = null

    private var imageResourceId: Int? = null
    private var mAudioResourceId: Int = 0


    constructor(defaultTranslation: String, miwokTranslation: String, audio: Int) {  //this one for phrases activity
        this.defaultTranslation = defaultTranslation
        this.miwokTranslation = miwokTranslation
        mAudioResourceId = audio
    }

    constructor(
        defaultTranslation: String,
        miwokTranslation: String,
        imageResourceId: Int,
        audio: Int
    ) { // for all other activities
        this.defaultTranslation = defaultTranslation
        this.miwokTranslation = miwokTranslation
        this.imageResourceId = imageResourceId
        mAudioResourceId = audio
    }

    /**
     * Get the default translation of the word.
     */
    fun getDefaultTranslation(): String {
        return this!!.defaultTranslation!!
    }

    /**
     * Get the Miwok translation of the word.
     */
    fun getMiwokTranslation(): String {
        return this!!.miwokTranslation!!
    }

    fun getImageResourceId(): Int {
        return this!!.imageResourceId!!
    }

    fun getmAudioResourceId(): Int {
        return mAudioResourceId
    }

}
