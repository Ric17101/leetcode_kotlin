package easy

fun main() {
//    val test = ValidAnagram().isAnagram(s = "anagram", t = "nagaram")
    val test = ValidAnagram().isAnagramO(s = "anagram", t = "nagaram")
//    val test = ValidAnagram().isAnagram2(s = "salesman", t = "nameless")
//    val test = ValidAnagram().isAnagram(s = "rat", t = "car")
    print(test)
}
class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val anagramS = s.toCharArray()
        val anagramT = t.toCharArray()
        anagramS.sort()
        anagramT.sort()
        return String(anagramS) == String(anagramT)
    }

    // Optimized 3ms
    fun isAnagramO(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val charCounter = List(26) {1}
        print(charCounter)

        val anagramS = s.toCharArray()
        val anagramT = t.toCharArray()
        anagramS.sort()
        anagramT.sort()
        return String(anagramS) == String(anagramT)
    }

    fun isAnagram2(s: String, t: String): Boolean {

        val anagram1 = hashMapOf<Char, Int?>()
        val anagramS = s.toCharArray()
        val anagramT = t.toCharArray()

        for (char in anagramS) {
            if (anagram1[char] == null)
                anagram1[char] = 1
            else
                anagram1[char] = anagram1[char]?.inc()
        }

        val anagram2 = hashMapOf<Char, Int?>()
        for (char in anagramT) {
            if (anagram2[char] == null)
                anagram2[char] = 1
            else
                anagram2[char] = anagram2[char]?.inc()
        }
        println(anagram1)
        print(anagram2)
        return anagram1 == anagram2
    }
}