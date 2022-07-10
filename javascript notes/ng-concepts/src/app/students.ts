export interface Student{

    id: number;
    name: string;
    contact: number;
    intro: string;
    subject: Array<String>;
    marks: number;

}

export const students = [
    {
        id:101,
        name: 'Rajesh',
        contact: 12345,
        intro:'This is Rajesh, I am a good student!',
        subject: ['CS', 'AC', 'IT']
        marks: 87
    },
    {
        id:102,
        name: 'Tom',
        contact: 56789,
        intro:'This is Tom, I am a average student!',
        subject: ['EE', 'NM', 'LA']
    },
    {
        id:103,
        name: 'Harry',
        contact: 12345,
        intro:'This is Harry, I am an excellent student!',
        subject: ['IT', 'AC', 'EE']
    },
];