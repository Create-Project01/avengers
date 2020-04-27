public void Doctor{

    private Integer id;

    private String name;

    private String Phome;

    private Integer age;

    public void setId(Integer id){
         this.id=id;
    }

    public Integer getId(){
	 return this.id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }


    public void setPhome(String Phone){
        this.Phome=Phome;
      
    }

    public String getPhome(){
         return this.Phone;
    }

    public void setAge(Integer age){
         this.Age=age;
    }

    public Integer getAge(){
	 return this.Age;
    }

    public String toString(){
        return "Doctor [id="+this.id+",name="+this.name+",Phone="+this.Phone+",age="+this.age+"]";
    }
    
}
