class number() {
    fun search(n:Int):Int{
        var i=1
        var j=1
        while(i<=n){
            while (j%i==0 ){
                i++
                if(i>n) break
            }
            if(i>n) break
            if(j%i!=0) {
                i = 1
                j++
            }
        }
        return j
    }
}