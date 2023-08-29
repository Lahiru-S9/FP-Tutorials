object letters {
  def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(word => word.length)
    val totalLetterOccurrences = letterCounts.reduce(_ + _)
    totalLetterOccurrences
  }

  def main (args: Array[String]): Unit = {
    val words = List("one", "two", "three ", "four")
    val totalLetterOccurrences = countLetterOccurrences(words)
    println(s"Total letter occurrences: $totalLetterOccurrences")
  }

}
