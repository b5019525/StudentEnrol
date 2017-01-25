package com.enrol

class BootStrap {

    def init = { servletContext ->
		def computing = new Course(
		title:'BSc Hon Computing',
		code:'COMP234',
		leader:'Dr Mary Poppins',
		department:'Computing',
		startDate:new Date('11/11/2016'),
		endDate:new Date('11/11/2020'),
		numberOfStudents:45,
		description:''' Add some text here''',

		tuitionFees:9000,
		studyMode:'Full-time'
	).save()
    
	
		def pcp = new Module(
		title:'PCP',
		code:'COMP234',
		credits:20,
		lecturer:'Dr Mary Poppins',
		course:'BSc Hon Computing',
		description:''' Add some text here''',

	).save()

		def student1 = new Student(
		name: 'Scott Talbot',		
		studentID: 'B5019525',
		dob: new Date('11/11/1997'),
		isFundingAvalable: 'true',
		email: 'b5019525@my.shu.ac.uk',
		username: 'b5019525',
		password: 'password',
		course: 'Computing',
	
	).save()

		def lecturer1 = new Lecturer(
		fullName: 'Ryan Johnson',		
		post: 'Leader',
		subject: 'Web Development',
		lecturerEmail: 'b5119525@my.shu.ac.uk',
		office: 'O322',
		bio:''' Add some text here''',
	
	).save()
    }
    def destroy = {
    }
}
