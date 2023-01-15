fun main(args: Array<String>) {
    val test = MaxWealth().maximumWealth(arrayOf(intArrayOf(1,2,3),intArrayOf(3,2,1)))
    print(test)
}

class MaxWealth {

    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealthSoFar = 0;

        accounts.forEach { account ->
            var currentCustomerWealth = 0;
            account.forEach { bank ->
                currentCustomerWealth += bank
            }

            maxWealthSoFar = Math.max(currentCustomerWealth, maxWealthSoFar)
        }


        return maxWealthSoFar
    }
}